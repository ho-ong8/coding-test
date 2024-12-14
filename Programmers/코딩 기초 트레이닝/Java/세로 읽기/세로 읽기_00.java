class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = ""; // 세로로 적힌 글자

        for (int i = c - 1; i < my_string.length(); i += m) {
            // charAt(): 문자 변환
            answer += my_string.charAt(i);
        }

        return answer;
    }
}
