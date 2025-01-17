class Solution {
    public int solution(int n) {
        int answer = 0; // 3x 마을의 숫자

        for (int i = 1; i <= n; i++) {
            answer++;

            // String.valueOf(): 문자열 변환
            // contains(): 문자열 포함 여부 확인
            // answer를 3으로 나눴을 때, 나머지가 0일 경우, "3"이 포함되어 있을 경우
            while (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                answer++;
            }
        }

        return answer;
    }
}
