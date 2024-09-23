class Solution {
    public int solution(String my_string) {
        int answer = 0; // 계산값

        // split(): 문자열 분리
        String[] str = my_string.split(" ");

        // Integer.parseInt(): 정수 변환
        answer += Integer.parseInt(str[0]);

        for (int i = 1; i < str.length - 1; i++) {
            // equals(): 문자열 비교
            // "+"일 경우 덧셈
            if (str[i].equals("+")) {
                answer += Integer.parseInt(str[i + 1]);
            // "-"일 경우 뺄셈
            } else if (str[i].equals("-")) {
                answer -= Integer.parseInt(str[i + 1]);
            }
        }

        return answer;
    }
}
