public class Find {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int result = 0;
        for (int i = 0; i < n; i++) {
            result = result ^ nums[i];
        }
        return result;
    }
    public static void main(String[] args) {
        Find find = new Find();
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println("The single number is: " + find.singleNumber(nums));
    }
}
