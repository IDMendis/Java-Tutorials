import java.util.*;

class DFSGraph {
    private Map<Integer, List<Integer>> adj = new HashMap<>();

    void addEdge(int u, int v) {
        adj.putIfAbsent(u, new ArrayList<>());
        adj.putIfAbsent(v, new ArrayList<>());
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    void dfs(int start, Set<Integer> visited) {
        visited.add(start);
        System.out.print(start + " ");
        for (int neighbor : adj.get(start)) {
            if (!visited.contains(neighbor)) {
                dfs(neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {
        DFSGraph g = new DFSGraph();
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);

        System.out.print("DFS starting from node 0: ");
        g.dfs(0, new HashSet<>());
    }
}
