class Solution {
    public int solution(int n) {
        int answer = 0; // 짝수의 합

        // 짝수 (2부터 시작, 2씩 증가)
        for (int i = 2; i <= n; i += 2) {
            answer += i;
        }

        return answer;
    }
}
