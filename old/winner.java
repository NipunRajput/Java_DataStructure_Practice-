import java.util.*;
public class winner{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        int s=arr[k-1];
        for(int i=0;i<n;i++){
            if(arr[i] >= s && arr[i] > 0){
                count++;
            }
        }
        System.out.println(count);
    }
}