class Solution {
    public int solution(int n) {
        int answer = 0; // 자릿수의 합

        // String.valueOf(): 문자열 변환
        // split(): 문자열 분리
        String[] str = String.valueOf(n).split("");

        for (int i = 0; i < str.length; i++) {
            // Integer.parseInt(): 정수 변환
            answer += Integer.parseInt(str[i]);
        }

        return answer;
    }
}
