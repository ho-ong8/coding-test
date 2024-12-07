class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";

        for (int i = 0; i < my_strings.length; i++) {
            String s = my_strings[i];

            // substring(startIndex, endIndex): startIndex(포함)부터 endIndex(불포함)까지 범위 내 문자열 자르기
            answer += s.substring(parts[i][0], parts[i][1] + 1);
        }

        return answer;
    }
}
