class Solution {
    public String solution(String cipher, int code) {
        String answer = ""; // 해독된 암호

        for (int i = code - 1; i < cipher.length(); i += code) {
            // charAt(): 문자 변환
            answer += cipher.charAt(i);
        }

        return answer;
    }
}
