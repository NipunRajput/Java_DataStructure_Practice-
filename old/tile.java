import java.util.Scanner;

public class tile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a = sc.nextInt();
        int tilesAlongM = (m + a - 1) / a;
        int tilesAlongN = (n + a - 1) / a;
        int result = tilesAlongM * tilesAlongN;
        System.out.println(result);
    }
}
