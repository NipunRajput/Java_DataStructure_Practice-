import java.util.*;
public class findMin {
    public static void printarr(int[] min){
        int n=min.length;
        for(int i=0;i<n;i++){
            System.out.print(min[i]+ " ");
        }
        System.out.println();
    }
    public static int findMinimum(int[] min){
        int minimum=min[0];
        for(int i=1;i<min.length;i++){
            if(min[i]<minimum){
                minimum=min[i];
            }
        }
        return minimum;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Size of Array:");
        int size=sc.nextInt();
        int []min=new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++){
            min[i]=sc.nextInt();
        }
        printarr(min);
        int Result=findMinimum(min);
        System.out.println("Minimum Element is:" + " " +Result);
    }
}
