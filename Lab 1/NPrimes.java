import java.util.Scanner;

public class NPrimes {
    
    public static boolean isPrime(int n){
        for(int i = 2; i <= n/2; i++)
            if (n % i == 0)
                return false;
        
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Primes: ");
        int N = sc.nextInt(); 
        sc.close();

        int prime_count = 0;
        int current_num = 2;
        while(prime_count < N){
            if (isPrime(current_num)){
                System.out.print(current_num + " ");
                prime_count++;
            }
            current_num++;
        }
    }

}
