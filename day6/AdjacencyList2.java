 import java.util.Scanner;
 import java.util.ArrayList;
 public class AdjacencyList2
 {
 	public static void main(String[] args) {
 		Scanner in = new Scanner(System.in);
 		System.out.print("Number of vertices : ");
 		int v = in.nextInt();
 		System.out.print("Number of edges : ");
 		int e  = in.nextInt();
 		ArrayList<ArrayList<Character>>graph = new ArrayList<>();
 		for (int i = 0; i<=v; i++)
 		    graph.add(new ArrayList<>());
         //Filling adjacency list		
 		for (int i = 0; i<e; i++){
 		    char v1 = in.next().charAt(0);
 		    char v2 = in.next().charAt(0);
 		    graph.get(v1-'A').add(v2);
 		    graph.get(v2 - 'A').add(v1);
 		}
 		//Printing adjacency list
 		for (int i = 0; i<v; i++){
 		    System.out.print((char)(i+65) + " --> ");
 		    System.out.println(graph.get(i));
 		}
 	}
 }
