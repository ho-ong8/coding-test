import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        // queue 생성 (선입선출)
        Queue<Integer> queue = new PriorityQueue<>((a, b) -> rank[a] - rank[b]);

        for (int i = 0; i < attendance.length; i++) {
            // true일 경우
            if (attendance[i]) {
                // add(): 원소 추가
                queue.add(i);
            }
        }

        // poll(): 원소 제거
        return (queue.poll() * 10000) + (queue.poll() * 100) + queue.poll();
    }
}
