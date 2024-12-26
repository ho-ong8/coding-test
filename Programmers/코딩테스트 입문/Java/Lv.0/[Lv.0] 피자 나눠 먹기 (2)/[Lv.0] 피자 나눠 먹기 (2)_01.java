class Solution {
    public int solution(int n) {
        int answer = 1; // 피자의 판 수

        // true일 경우
        while (true) {
            // 피자의 조각 수 = 피자의 판 수 * 6
            // 피자의 조각 수를 n으로 나눴을 때, 나머지가 0일 경우
            if (answer * 6 % n == 0) {
                return answer;
            }

            answer++;
        }
    }
}
