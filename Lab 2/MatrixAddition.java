import java.util.Scanner;

public class MatrixAddition {
    
    public static int[][] Add(int[][] A, int[][] B){
        int m = A.length;
        int n = A[0].length;

        int[][] res = new int[m][n];
        for(int i=0;i< m; i++)
            for(int j=0; j<n; j++)
                res[i][j] = A[i][j] + B[i][j];

        return res;
    }

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dimensions of matrix: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] A = new int[m][n], B = new int[m][n], res = new int[m][n];

        System.out.println("Enter elements of A: ");
        for(int i=0;i< m; i++)
            for(int j=0; j<n; j++)
                A[i][j] = sc.nextInt();

        System.out.println("Enter elements of B: ");
        for(int i=0;i< m; i++)
            for(int j=0; j<n; j++)
                B[i][j] = sc.nextInt();

        res = Add(A, B);

        System.out.println("Sum is: ");
        for(int i=0;i< m; i++){
            for(int j=0; j<n; j++)
                System.out.print(res[i][j] + " ");
            System.out.print("\n");
        }

        sc.close();
    }

}
