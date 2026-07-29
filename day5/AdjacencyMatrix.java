import java.util.Scanner;
//Graph representation using adjacency matrix
public class AdjacencyMatrix{
    private static void printMatrix(int[][] m){
        for (int r = 0; r<m.length; r++){
            for (int c = 0; c<m[r].length; c++)
                System.out.print(m[r][c] + " ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number of vertices: ");
        int v = in.nextInt();
        System.out.print("Number of edges : ");
        int e = in.nextInt();
        int[][] adjMat = new int[v][v];
        for (int i = 1; i<=e; i++){
            int v1 = in.nextInt();
            int v2 = in.nextInt();
            adjMat[v1][v2] = 1;
            adjMat[v2][v1] = 1;
        }
        in.close();
        printMatrix(adjMat);
    }
}