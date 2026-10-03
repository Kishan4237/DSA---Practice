import java.util.*;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> answer = new ArrayList<>();

        for (int num = left; num <= right; num++) {

            int n = num;
            boolean isSelfDividing = true;

            while (n > 0) {

                int digit = n % 10;

                if (digit == 0 || num % digit != 0) {
                    isSelfDividing = false;
                    break;
                }

                n = n / 10;
            }

            if (isSelfDividing) {
                answer.add(num);
            }
        }

        return answer;
    }
}