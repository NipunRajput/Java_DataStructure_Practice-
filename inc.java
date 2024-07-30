import java.util.*;
public class inc{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int X=0;
        for(int i=0;i<n;i++){
            String input=sc.nextLine();
            if(input.equals("X++")||input.equals("++X")){
                X=X+1;
            }else if(input.equals("X--")||input.equals("--X")){
                X=X-1;
            }
        }
        System.out.println(X);
    }
}