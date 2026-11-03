
class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int sumA = 0;
        int sumB = 0;

        for (int num : aliceSizes) {
            sumA += num;
        }

        for (int num : bobSizes) {
            sumB += num;
        }

        int diff = (sumB - sumA) / 2;

        HashSet<Integer> set = new HashSet<>();

        for (int num : bobSizes) {
            set.add(num);
        }

        for (int x : aliceSizes) {
            int y = x + diff;

            if (set.contains(y)) {
                return new int[]{x, y};
            }
        }

        return new int[]{};
    }
}
