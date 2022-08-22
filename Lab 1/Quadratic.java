import java.util.Scanner;
import java.lang.Math;

public class Quadratic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the coefficients of the equation: ");
        double a = sc.nextInt(); 
        double b = sc.nextInt(); 
        double c = sc.nextInt();
        sc.close();
        
        double D = (b * b - 4 * a * c);
        int det = 0;
        if (D >= 0){
            det = 1;
        }

        switch(det){
            
            case 0:
                double real = -b/(2*a);
                double im = Math.sqrt(Math.abs(b * b - 4 * a * c))/(2*a);

                System.out.println("Result is " + real + " + " + im + "i" + " and " + real + " - " + im + "i");
                break;

            default:
                double res1 = (-b + Math.sqrt(D))/(2*a);
                double res2 = (-b - Math.sqrt(D))/(2*a);
                System.out.println("Result is " + res1 + " and " + res2);
        }
    }
}
