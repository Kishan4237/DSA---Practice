
class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int k = primes.length;

        int[] ugly = new int[n];
        int[] index = new int[k];

        ugly[0] = 1;

        for (int i = 1; i < n; i++) {
            long min = Long.MAX_VALUE;

            // Find the next smallest super ugly number
            for (int j = 0; j < k; j++) {
                long candidate = (long) primes[j] * ugly[index[j]];
                min = Math.min(min, candidate);
            }

            ugly[i] = (int) min;

            // Update all pointers that produced the minimum
            for (int j = 0; j < k; j++) {
                long candidate = (long) primes[j] * ugly[index[j]];

                if (candidate == min) {
                    index[j]++;
                }
            }
        }

        return ugly[n - 1];
    }
}
