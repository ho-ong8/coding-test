class Solution {
    public int solution(int[][] lines) {
        int answer = 0; // 겹치는 선분의 길이
        int[] num = new int[200]; // 범위

        for (int i = 0; i < lines.length; i++) {
            int start = lines[i][0] + 100; // 시작
            int end = lines[i][1] + 100; // 마지막

            for (int j = start; j < end; j++) {
                num[j]++;
            }
        }

        for (int n : num) {
            // 1보다 클 경우
            if (n > 1) {
                answer++;
            }
        }

        return answer;
    }
}
