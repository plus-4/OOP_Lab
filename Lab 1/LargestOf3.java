import java.util.Scanner;

public class LargestOf3 {
    
    public static int largest(int a, int b, int c){
        
        if (a > b)
        {
            if (a > c)
                return a;
            else
                return c;
        } 
        else 
        {
            if (b > c)
                return b;
            else
                return c;
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt(); 
        int b = sc.nextInt(); 
        int c = sc.nextInt();
        sc.close();

        int largest = largest(a, b, c);
        System.out.println("Largest number is " + largest);
    }
}
