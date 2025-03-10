import java.util.*;
public class twosum{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int newarr[]=new int[2];
        int sum=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==sum){
                    newarr[0]=i;
                    newarr[1]=j;
                    System.out.println(Arrays.toString(newarr));
                }
            }
        }
        System.out.println(-1);
    }
}