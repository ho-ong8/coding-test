import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0; // 계산값
        int[] num = new int[rank.length]; // 참석 가능 학생

        for (int i = 0; i < rank.length; i++) {
            // true일 경우
            if (attendance[i]) {
                num[i] = rank[i];
            } else {
                // Integer.MAX_VALUE: 정수 최댓값
                rank[i] = Integer.MAX_VALUE;
            }
        }

        Arrays.sort(rank); // 오름차순 정렬

        for (int i = 0; i < num.length; i++) {
            // 10000 x a + 100 x b + c
            // 1등일 경우 (a)
            if (rank[0] == num[i]) {
                answer += i * 10000;
            // 2등일 경우 (b)
            } else if (rank[1] == num[i]) {
                answer += i * 100;
            // 3등일 경우 (c)
            } else if (rank[2] == num[i]) {
                answer += i;
            }
        }

        return answer;
    }
}
