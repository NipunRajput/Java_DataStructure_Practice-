import java.util.*;
public class findsecondMax {
    public static void printarr(int []nums){
        int n=nums.length;
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+ " ");
        }
        System.out.println();
    }
    public static int secondMax(int[]nums){
        int Max=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>Max){
                secondmax=Max;
                Max=nums[i];
            }else if(nums[i]>secondmax && nums[i]!=Max){
                secondmax=nums[i];
            }
        }
        return secondmax;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("The size of Array:");
        int size=sc.nextInt();
        int[] nums=new int[size];
        System.out.println("Enter these amount of Elements:"+"  "+ size);
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }
        printarr(nums);
        int result=secondMax(nums);
        System.out.println("The second Max value is:"+" "+ result);
    }
}
