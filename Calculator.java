import java.util.*;
public class Calculator{
    public static int Add(int first, int second, String st){
        return switch (st) {
            case "+" -> first + second;
            case "-" -> first - second;
            case "*" -> first * second;
            case "/" -> first / second;
            default -> 0;
        };
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        sc.nextLine();
        String str=sc.nextLine();
        int ans=Add(num1,num2,str);
        System.out.println(ans);
    }
}