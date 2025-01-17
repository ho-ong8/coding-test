class Solution {
    public int[] solution(int[][] score) {
        double[] num = new double[score.length];

        for (int i = 0; i < score.length; i++) {
            // 영어 점수와 수학 점수의 평균
            num[i] = (double) (score[i][0] + score[i][1]) / 2;
        }

        int[] answer = new int[score.length];

        // num[i] = 이전 원소, num[j] = 다음 원소
        for (int i = 0; i < score.length; i++) {
            int cnt = 1; // 등수

            for (int j = 0; j < score.length; j++) {
                // 이전 원소가 작을 경우
                if (num[i] < num[j]) {
                    cnt++;
                }

                answer[i] = cnt;
            }
        }

        return answer;
    }
}
