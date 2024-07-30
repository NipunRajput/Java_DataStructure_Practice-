import java.util.*;
public class resizeArray {
    public static int[] resizearr(int[] arr, int Capacity){
        int temp[]=new int[Capacity];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        return temp;
    }
    public static void printArr(int []arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[]originalarr=new int[size];
        for(int i=0;i<size;i++){
            originalarr[i]=sc.nextInt();
        }
        printArr(originalarr);
        System.out.println("The length of the array:"+" "+originalarr.length);
        originalarr=resizearr(originalarr, 10);
        System.out.println("The length of Resized array:"+" "+originalarr.length);
        printArr(originalarr);

    }

}
