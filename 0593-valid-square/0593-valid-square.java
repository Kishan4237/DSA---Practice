
import java.util.*;

class Solution {
    public boolean validSquare(int[] p1, int[] p2,
                               int[] p3, int[] p4) {

        int[][] points = {p1, p2, p3, p4};
        Set<Integer> distances = new HashSet<>();

        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {

                int dx = points[i][0] - points[j][0];
                int dy = points[i][1] - points[j][1];

                int distance = dx * dx + dy * dy;
                distances.add(distance);
            }
        }

        // 4 equal sides + 2 equal diagonals
        return distances.size() == 2
            && !distances.contains(0)
            && Collections.frequency(
                new ArrayList<>(distances), 0
            ) == 0;
    }
}
