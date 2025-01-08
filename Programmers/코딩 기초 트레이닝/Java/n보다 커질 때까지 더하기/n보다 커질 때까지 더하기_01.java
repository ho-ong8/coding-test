class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0; // 배열의 원소의 합

        for (int i = 0; answer <= n; i++) {
            answer += numbers[i];
        }

        return answer;
    }
}
