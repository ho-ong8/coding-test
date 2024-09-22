class Solution {
    public int solution(int n) {
        int answer = 0; // 합성수의 개수

        for (int i = 1; i <= n; i++) {
            int cnt = 0; // 약수의 개수

            // 약수 구하기
            for (int j = 1; j <= i; j++) {
                // i를 j로 나눴을 때, 나머지가 0일 경우
                if (i % j == 0) {
                    cnt++;
                }
            }

            // 합성수 구하기
            // 약수의 개수가 3개 이상일 경우
            if (cnt >= 3) {
                answer++;
            }
        }

        return answer;
    }
}
