import java.io.InputStreamReader;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine().trim());
            int target = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(br.readLine().trim());
            }

            boolean found = false;
            for (int i = 0; i < n - 2; i++) {
                for (int j = i + 1; j < n - 1; j++) {
                    for (int k = j + 1; k < n; k++) {
                        if (arr[i] + arr[j] + arr[k] == target) {
                            System.out.println(arr[i] + ", " + arr[j] + ", " + arr[k]);
                            return;
                        }
                    }
                }
            }

            System.out.println("No Triplet Exists");
        }
    }
