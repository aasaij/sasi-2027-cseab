import java.util.Scanner;
import java.util.ArrayList;
// Graph Traversal - Depth First Search
public class DepthFirstSearch
{
    public static void dfs(ArrayList<ArrayList<Character>> g, char node, boolean[] visited){
        visited[node-'A'] = true;
        System.out.print(node + " ");
        for (char neighbor : g.get(node-'A')){
            if (!visited[neighbor-'A'])
                dfs(g, neighbor, visited);
        }
    }
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Number of vertices : ");
		int v = in.nextInt();
		System.out.print("Number of edges : ");
		int e  = in.nextInt();
		boolean[] visited = new boolean[v];
		ArrayList<ArrayList<Character>> graph = new ArrayList<>();
		for (int i = 0; i<=v; i++)
		    graph.add(new ArrayList<>());
        //Filling adjacency list		
		for (int i = 0; i<e; i++){
		    char v1 = in.next().charAt(0);
		    char v2 = in.next().charAt(0);
		    graph.get(v1-'A').add(v2);
		    graph.get(v2 - 'A').add(v1);
		}
		System.out.print("Starting Node : ");
		char node = in.next().charAt(0);
		dfs(graph, node);
	}
}
