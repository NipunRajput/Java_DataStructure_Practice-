//public class AP {
//    public static void main(String[] args) {
//        float a = 1.5f;
//        float d = 3.0f;
//        int n = 5;
//
//        System.out.println("Sum of Given AP Series: " + AP(a, d, n));
//    }
//
//    public static float AP(float a, float d, int n) {
//        float sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum += a;
//            a += d;
//        }
//        return sum;
//    }
//}
//public class AP {
//    public static void main(String[] args) {
//        float a = 1.5f;
//        float d = 3.0f;
//        int n = 5;
//
//        System.out.println("Sum of Given AP Series: " + sumOfAp(a, d, n));
//    }
//
//    public static float sumOfAp(float a, float d, int n) {
//        float sum = (n / 2.0f) * (2.0f * a + (n - 1) * d);
//        return sum;
//    }
//}

public class AP{
    public static void main(String[] args) {
        float a = 1.5f;
        float d = 3.0f;
        int n = 5;

        System.out.println("Sum of Given AP Series using while loop: " + sumOfApWhileLoop(a, d, n));
    }

    public static float sumOfApWhileLoop(float a, float d, int n) {
        float sum = 0;
        int i = 0;
        while (i < n) {
            sum += a + i * d;
            i++;
        }
        return sum;
    }
}

