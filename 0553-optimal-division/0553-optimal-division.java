
class Solution {
    public String optimalDivision(int[] nums) {
        int n = nums.length;

        if (n == 1) {
            return String.valueOf(nums[0]);
        }

        if (n == 2) {
            return nums[0] + "/" + nums[1];
        }

        StringBuilder result = new StringBuilder();
        result.append(nums[0]).append("/(");

        for (int i = 1; i < n; i++) {
            result.append(nums[i]);

            if (i < n - 1) {
                result.append("/");
            }
        }

        result.append(")");

        return result.toString();
    }
}
