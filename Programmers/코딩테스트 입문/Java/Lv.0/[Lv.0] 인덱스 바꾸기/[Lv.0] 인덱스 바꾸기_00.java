class Solution {
    public String solution(String my_string, int num1, int num2) {
        // split(): 문자열 분리
        String[] str = my_string.split("");
        String answer = str[num1];

        // 인덱스 바꾸기
        str[num1] = str[num2];
        str[num2] = answer;

        // join(): 문자열 병합
        return String.join("", str);
    }
}
