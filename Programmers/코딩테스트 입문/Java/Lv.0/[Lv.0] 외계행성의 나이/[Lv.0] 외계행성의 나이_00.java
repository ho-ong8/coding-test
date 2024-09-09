class Solution {
    public String solution(int age) {
        String answer = ""; // PROGRAMMERS-962식 나이

        // String.valueOf(): 문자열 변환
        String s = String.valueOf(age);

        // split(): 문자열 분리
        String[] str = s.split("");

        for (int i = 0; i < s.length(); i++) {
            // Integer.parseInt(): 정수 변환
            // ASCII 코드 변환 (0-9 = 48-57, A-Z = 65-90, a-z = 97-122)
            // 정수 -> 문자 변환 (char), 문자 -> 정수 변환 (int)
            answer += (char) (Integer.parseInt(str[i]) + 97);
        }

        return answer;
    }
}
