import java.util.Scanner;

public class Armstrong {
    
    public static boolean isArmstrong(int n){
        int _n = n;
        int sum = 0;
        while (_n > 0){
            int digit = _n % 10;
            sum += digit * digit * digit;
            _n /= 10;
        }

        return n == sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt(); 
        sc.close();

        System.out.println(isArmstrong(n) ? (n + " is Armstrong") : (n + " is not Armstrong"));
    }

}
