class Solution {
    public String solution(String cipher, int code) {
        String answer = ""; // 해독된 암호

        for (int i = code; i <= cipher.length(); i += code) {
            // substring(startIndex, endIndex): startIndex(포함)부터 endIndex(불포함)까지 범위 내 문자열 반환
            answer += cipher.substring(i - 1, i);
        }

        return answer;
    }
}
