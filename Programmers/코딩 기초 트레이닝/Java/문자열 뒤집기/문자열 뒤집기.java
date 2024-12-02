class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";

        // substring(startIndex, endIndex): startIndex(포함)부터 endIndex(불포함)까지 범위 내 문자열 자르기
        // split(): 문자열 분리
        String ss = my_string.substring(s, e + 1);
        String[] str = my_string.substring(s, e + 1).split("");

        for (int i = 0; i < str.length; i++) {
            // 배열의 원소 역순 삽입 = 배열의 마지막 원소 - i
            // 배열의 마지막 원소 = 배열의 길이 - 1
            answer += str[str.length - 1 - i];
        }

        // replaceAll(regex, replacement): 문자열을 다른 문자열로 치환 (regex: 정규표현식)
        return my_string.replaceAll(ss, answer);
    }
}
