import java.util.Scanner;

public class SumOfDigits {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt(); 
        sc.close();

        int _n = n;
        int sum = 0;
        while (_n > 0){
            int digit = _n % 10;
            sum += digit;
            _n /= 10;
        }

        System.out.println("Sum of digits is " + sum);
    }

}
