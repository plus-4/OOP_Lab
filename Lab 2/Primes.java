import java.util.Scanner;

public class Primes {
    
    public static boolean isPrime(int n){
        for(int i = 2; i <= n/2; i++)
            if (n % i == 0)
                return false;
        
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers of items: ");
        int len = sc.nextInt();
        int[] nums = new int[len];

        System.out.print("Enter the items: ");
        for(int i = 0; i < len; i++)
            nums[i] = sc.nextInt();
        
        sc.close();

        boolean found = false;
        for (int i = 0; i < len; i++){
            if(isPrime(nums[i])){
                System.out.print(nums[i] + " ");
                found = true;
            }
        }

        if(!found){
            System.out.println("No primes found");
        }
    }

}
