
class Solution {
    public int nextGreaterElement(int n) {

        char[] nums = String.valueOf(n).toCharArray();

        int i = nums.length - 2;

        // Step 1: Find the first smaller digit from right
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // No greater permutation exists
        if (i < 0) {
            return -1;
        }

        // Step 2: Find the next greater digit
        int j = nums.length - 1;

        while (nums[j] <= nums[i]) {
            j--;
        }

        // Swap
        char temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

        // Step 3: Reverse the remaining digits
        int left = i + 1;
        int right = nums.length - 1;

        while (left < right) {
            temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }

        // Convert to number and check 32-bit limit
        long result = Long.parseLong(new String(nums));

        if (result > Integer.MAX_VALUE) {
            return -1;
        }

        return (int) result;
    }
}
