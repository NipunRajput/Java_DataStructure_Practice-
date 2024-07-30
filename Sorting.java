import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            for (int m = 0; m <= n - 1; m += 2) {
                if (m == n - 1 || arr[m] != arr[m + 1]) {
                    System.out.println(arr[m]);
                    break;
                }

            }
        }
    }
}
