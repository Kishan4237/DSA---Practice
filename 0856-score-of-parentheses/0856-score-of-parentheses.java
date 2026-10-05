class Solution {
    public int scoreOfParentheses(String s) {

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                stack.push(0);
            } else {
                int innerScore = stack.pop();
                int score = stack.pop();

                if (innerScore == 0) {
                    // "()"
                    score += 1;
                } else {
                    // "(A)"
                    score += 2 * innerScore;
                }

                stack.push(score);
            }
        }

        return stack.pop();
    }
}