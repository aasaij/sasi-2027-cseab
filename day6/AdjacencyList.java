 import java.util.Scanner;
 import java.util.ArrayList;
 public class AdjacencyList
 {
 	public static void main(String[] args) {
 		Scanner in = new Scanner(System.in);
 		System.out.print("Number of vertices : ");
 		int v = in.nextInt();
 		System.out.print("Number of edges : ");
 		int e  = in.nextInt();
 		ArrayList<ArrayList<Integer>>graph = new ArrayList<>();
 		for (int i = 0; i<=v; i++)
 		    graph.add(new ArrayList<>());
         //Filling adjacency list		
 		for (int i = 0; i<e; i++){
 		    int v1 = in.nextInt();
 		    int v2 = in.nextInt();
 		    graph.get(v1).add(v2);
 		    graph.get(v2).add(v1);
 		}
 		//Printing adjacency list
 		for (int i = 0; i<v; i++){
 		    System.out.print(i + " --> ");
 		    System.out.print(graph.get(i));
 		    System.out.println("]");
 		}
 	}
 }
