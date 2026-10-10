
class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {

        int n = nums1.length;
        int[] diff = new int[n];
        int maxDiff = 0;

        long k = (long) k1 + k2;

        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            maxDiff = Math.max(maxDiff, diff[i]);
        }

        long totalDiff = 0;
        for (int d : diff) {
            totalDiff += d;
        }

        if (k >= totalDiff) {
            return 0;
        }

        int low = 0, high = maxDiff;

        while (low < high) {
            int mid = low + (high - low) / 2;
            long required = 0;

            for (int d : diff) {
                if (d > mid) {
                    required += d - mid;
                }
            }

            if (required <= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        int target = low;
        long required = 0;
        long sum = 0;

        for (int d : diff) {
            if (d > target) {
                required += d - target;
                d = target;
            }
            sum += (long) d * d;
        }

        long remaining = k - required;

        if (target > 0) {
            sum -= remaining * (2L * target - 1);
        }

        return sum;
    }
}
