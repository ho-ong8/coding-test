class Solution {
    public String solution(String str1, String str2) {
        String answer = "";

        for (int i = 0; i < str1.length(); i++) {
            // substring(startIndex, endIndex): startIndex(포함)부터 endIndex(불포함)까지 범위 내 문자열 자르기
            answer += str1.substring(i, i + 1);
            answer += str2.substring(i, i + 1);
        }

        return answer;
    }
}
