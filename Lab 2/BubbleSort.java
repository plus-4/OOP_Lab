import java.util.Scanner;

public class BubbleSort {
    
    public static int[] sort(int[] nums, int len){
        
        for (int i=1; i<len; i++){
            for(int j=0; j<len-i; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        return nums;
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

        nums = sort(nums, len);
        System.out.print("Sorted array is: ");
        for(int i = 0; i < len; i++)
            System.out.print(nums[i] + " ");

    }


}
