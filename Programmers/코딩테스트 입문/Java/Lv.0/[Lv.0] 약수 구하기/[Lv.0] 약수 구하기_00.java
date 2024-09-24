class Solution {
    public int[] solution(int n) {
        int cnt = 0; // 약수의 개수

        // 약수의 개수 구하기
        for (int i = 1; i <= n; i++) {
            // n을 i로 나눴을 때, 나머지가 0일 경우
            if (n % i == 0) {
                cnt++;
            }
        }

        int[] answer = new int[cnt];
        cnt = 0;

        // 약수의 배열 구하기
        for (int i = 1; i <= n; i++) {
            // n을 i로 나눴을 때, 나머지가 0일 경우
            if (n % i == 0) {
                answer[cnt] = i;
                cnt++;
            }
        }

        return answer;
    }
}
