import java.util.Scanner;

public class TraceNNorm {
    

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dimensions of matrix: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] A = new int[m][n];
        int trace = 0;
        double norm = 0;
        
        System.out.println("Enter elements of the matrix: ");
        for(int i=0;i< m; i++){
            for(int j=0; j<n; j++){
                A[i][j] = sc.nextInt();
                if(i == j){
                    trace += A[i][j];
                }
                norm += A[i][j] * A[i][j];
            }
        }
        norm = Math.sqrt(norm);
        sc.close();

        System.out.println("Trace is " + trace);
        System.out.println("Norm is " + norm);
    }

}
