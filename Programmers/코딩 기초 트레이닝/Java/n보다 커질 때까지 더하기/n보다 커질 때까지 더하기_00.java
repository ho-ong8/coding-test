class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0; // 배열의 원소의 합

        for (int i = 0; i < numbers.length; i++) {
            // n 이하일 경우
            if (answer <= n) {
                answer += numbers[i];
            }
        }

        return answer;
    }
}
