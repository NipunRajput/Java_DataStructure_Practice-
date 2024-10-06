import java.util.HashSet;
import java.util.*;
public class maxpairs{

    public static String Rever(String s){
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }

    public static int max(String[] s){
        HashSet<String> set=new HashSet<>();
        int count=0;
        for(int i=0;i<s.length;i++){
            String rev=Rever(s[i]);
            if(set.contains(rev)){
                count++;
                set.remove(rev);
            }else{
                set.add(s[i]);
            }
        }
        return count;
    }
    public static void main(String[]args){
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            sc.nextLine();
            String[] s=new String[n];
            for(int i=0;i<n;i++){
                s[i]=sc.nextLine();
            }
            System.out.println(max(s));
        }

    }
}