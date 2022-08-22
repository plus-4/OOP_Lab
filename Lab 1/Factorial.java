import java.util.Scanner;

public class Factorial {
    
    public static int factorial(int n){
        int res = 1;
        for (int i = 2; i <= n; i++)
            res *= i;
        
            return res;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of n and r:");
        int n = sc.nextInt(); 
        int r = sc.nextInt(); 
        sc.close();

        int nCr = factorial(n) / (factorial(n - r) * factorial(r));
        System.out.println("nCr = " + nCr);
    }

}
