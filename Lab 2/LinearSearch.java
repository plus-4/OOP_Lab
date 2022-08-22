import java.util.Scanner;

public class LinearSearch {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers of items: ");
        int len = sc.nextInt();
        int[] nums = new int[len];

        System.out.print("Enter the items: ");
        for(int i = 0; i < len; i++)
            nums[i] = sc.nextInt();


        System.out.print("Enter number to find: ");
        int num = sc.nextInt();
        
        sc.close();

        boolean found = false;
        for (int i = 0; i < len; i++){
            if(nums[i] == num){
                System.out.println(num + "found at position " + (i+1));
                found = true;
            }
        }

        if(!found){
            System.out.println(num + " not found");
        }
    }

}
