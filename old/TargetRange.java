public class TargetRange {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = searchRange(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};

        // Find the first occurrence of the target
        int first = findFirst(nums, target);
        if (first == -1) {
            return result;
        }

        // Find the last occurrence of the target
        int last = findLast(nums, target);

        result[0] = first;
        result[1] = last;

        return result;
    }

    private static int findFirst(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int first = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] >= target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            if (nums[mid] == target) {
                first = mid;
            }
        }
        return first;
    }

    private static int findLast(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int last = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            if (nums[mid] == target) {
                last = mid;
            }
        }
        return last;
    }
}
