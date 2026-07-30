import java.util.Scanner;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
// Graph Traversal - Breadth First Search
public class BreadthFirstSearch
{
    public static void bfs(ArrayList<ArrayList<Character>> g, char startNode, boolean[] visited){
        Queue<Character> queue = new LinkedList<>();
        queue.offer(startNode);
        visited[startNode - 'A'] = true;
        
        while (!queue.isEmpty()){
            char current = queue.poll();
            System.out.print(current + " ");
            for (char neighbor : g.get(current-'A')){
                if (!visited[neighbor-'A']){
                    visited[neighbor-'A'] = true;
                    queue.offer(neighbor);
                }
            }
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
		bfs(graph, node,visited);
	}
}
