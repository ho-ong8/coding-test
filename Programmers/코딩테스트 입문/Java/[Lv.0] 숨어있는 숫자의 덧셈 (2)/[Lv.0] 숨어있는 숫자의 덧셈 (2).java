class Solution {
    public int solution(String my_string) {
        int answer = 0; // 자연수의 합

        // split(): 문자열 분리
        // [a-z|A-Z]: a부터 z까지, A부터 Z까지 (or)
        String[] str = my_string.split("[a-z|A-Z]");

        for (int i = 0; i < str.length; i++) {
            // equals(): 문자열 비교
            // 빈 문자열이 아닐 경우
            if (!str[i].equals("")) {
                // Integer.parseInt(): 정수 변환
                answer += Integer.parseInt(str[i]);
            }
        }

        return answer;
    }
}
