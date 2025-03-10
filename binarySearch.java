import java.util.*;
public class binarySearch{
    public static String Bsearch(int []newarr,int tar){
        int low=0;
        int high=newarr.length-1;
        while(low<=high){
                int mid=low+(high-low)/2;
                if(newarr[mid]==tar){
                    return "True";
                }else if(newarr[mid]>tar){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
        return "False";
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        String result=Bsearch(arr,target);
        System.out.println(result);
    }
}