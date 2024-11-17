class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0; // 모드

        for (int i = 0; i < code.length(); i++) {
            // charAt(): 문자 변환
            // '1'일 경우
            if (code.charAt(i) == '1') {
                mode = 1 - mode; // 모드 변경
            // i를 2로 나눴을 때, 나머지가 모드일 경우
            } else if (i % 2 == mode) {
                answer += code.charAt(i);
            }
        }

        // equals(): 문자열 비교
        // 빈 문자열일 경우 "EMPTY", 아닐 경우 answer
        return "".equals(answer) ? "EMPTY" : answer;
    }
}
