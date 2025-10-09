import java.net.*;
import java.util.Scanner;

public class UDPClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();  // Create socket
        InetAddress serverAddress = InetAddress.getByName("localhost");  // Server address (localhost for testing)
        int serverPort = 8088;  // Server port

        Scanner scanner = new Scanner(System.in);
        String clientMessage = "Hello, Server!";
        byte[] sendData = clientMessage.getBytes();

        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);

        int retries = 0;
        boolean responseReceived = false;

        while (retries < 3 && !responseReceived) {
            socket.send(sendPacket);  // Send message to server
            System.out.println("Message sent to server: " + clientMessage);

            // Set up a timeout and wait for a response
            socket.setSoTimeout(3000);  // 3 seconds timeout

            try {
                byte[] receiveData = new byte[1024];  // Buffer to receive the response
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

                socket.receive(receivePacket);  // Wait for server's response
                String serverResponse = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Received response from server: " + serverResponse);
                responseReceived = true;  // Mark that the response is received

            } catch (SocketTimeoutException e) {
                retries++;  // Increment retry counter
                System.out.println("No response received, retrying... (" + retries + "/3)");
            }
        }

        if (!responseReceived) {
            System.out.println("Failed to receive a response after 3 retries.");
        }

        socket.close();  // Close the socket
    }
}
