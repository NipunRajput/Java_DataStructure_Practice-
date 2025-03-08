import java.util.*;
public class moveZero {
    public static int[] movezeroEnd(int[]nums){
        int n=nums.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0 && nums[j]==0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
            if(nums[j]!=0){
                j++;
            }
        }
        return nums;
    }
    public static void printNums(int[]nums){
        int n=nums.length;
        for(int i=0;i<n;i++){
            System.out.println(nums[i]+ " ");
        }
        System.out.println();

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int size=sc.nextInt();
        System.out.println("Enter these amount of elements in the array:"+" "+ size);
        int[] nums=new int[size];
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }
        printNums(nums);
        int[] Result=movezeroEnd(nums);
        printNums(Result);
    }
}
