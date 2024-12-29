class Solution {
    public int solution(String binomial) {
        int answer = 0; // 계산값

        // split(): 문자열 분리
        String[] str = binomial.split(" ");

        // equals(): 문자열 비교
        // "+"일 경우 덧셈
        if (str[1].equals("+")) {
            // Integer.parseInt(): 정수 변환
            answer = Integer.parseInt(str[0]) + Integer.parseInt(str[2]);
        // "-"일 경우 뺄셈
        } else if (str[1].equals("-")) {
            answer = Integer.parseInt(str[0]) - Integer.parseInt(str[2]);
        // "*"일 경우 곱셈
        } else if (str[1].equals("*")) {
            answer = Integer.parseInt(str[0]) * Integer.parseInt(str[2]);
        }

        return answer;
    }
}
