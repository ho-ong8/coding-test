class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 1; // 공을 던지는 사람의 번호

        for (int i = 1; i < k; i++) {
            // 한 명 건너뛰기
            answer += 2;

            // 공을 던지는 사람의 번호가 클 경우
            if (answer > numbers.length) {
                // 배열의 앞부분으로 이동 = 공을 던지는 사람의 번호 - 배열의 길이
                answer -= numbers.length;
            }
        }

        return answer;
    }
}
