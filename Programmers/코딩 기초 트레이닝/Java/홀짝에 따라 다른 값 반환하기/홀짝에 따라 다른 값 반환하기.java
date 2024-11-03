class Solution {
    public int solution(int n) {
        int answer = 0;

        // n을 2로 나눴을 때, 나머지가 0일 경우
        if (n % 2 == 0) {
            // 짝수 (2부터 시작, 2씩 증가)
            for (int i = 2; i <= n; i += 2) {
                // 짝수의 제곱의 합
                answer += i * i;
            }
        } else {
            // 홀수 (1부터 시작, 2씩 증가)
            for (int i = 1; i <= n; i += 2) {
                // 홀수의 합
                answer += i;
            }
        }

        return answer;
    }
}
