class Solution {
    public int solution(int n) {
        int answer = 0; // 순서쌍의 개수

        for (int i = 1; i <= n; i++) {
            // 순서쌍 = 약수
            // n을 i로 나눴을 때, 나머지가 0일 경우
            if (n % i == 0) {
                answer++;
            }
        }

        return answer;
    }
}
