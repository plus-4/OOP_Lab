import java.util.Scanner;

public class InsertNDelete {
    
    public static int[] insert(int num, int[] nums, int idx, int len){
        
        for (int i=len; i>=idx; i--){
            nums[i+1] = nums[i];
        }
        
        nums[idx] = num;
        return nums;
    }
    
    public static int[] delete(int num, int[] nums, int len){

        for (int i=0; i < len; i++)
            if (nums[i] == num){
                int idx = i;
                for (int j=idx; j < len; j++){
                    nums[j] = nums[j+1];
                }
            }
        
        return nums;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers of items: ");
        int len = sc.nextInt();
        int[] nums = new int[100];

        System.out.print("Enter the items: ");
        for(int i = 0; i < len; i++)
            nums[i] = sc.nextInt();

        System.out.print("Enter the number to insert and at what position: ");
        int insert = sc.nextInt();
        int pos = sc.nextInt();

        nums = insert(insert, nums, pos-1, len);
        len++;
        System.out.print("Array after insertion is: ");
        for(int i = 0; i < len; i++)
            System.out.print(nums[i] + " ");
        System.out.print("\n");

        System.out.print("Enter the number to delete: ");
        int delete = sc.nextInt();
        System.out.print("\n");

        nums = delete(delete, nums, len);
        len--;
        System.out.print("Array after deletion is: ");
        for(int i = 0; i < len; i++)
            System.out.print(nums[i] + " ");
        
        sc.close();

        

    }


}
