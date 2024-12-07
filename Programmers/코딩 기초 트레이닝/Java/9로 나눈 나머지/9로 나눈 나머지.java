class Solution {
    public int solution(String number) {
        int answer = 0; // 9로 나눈 나머지

        // split(): 문자열 분리
        String[] str = number.split("");

        for (int i = 0; i < str.length; i++) {
            // Integer.parseInt(): 정수 변환
            answer += Integer.parseInt(str[i]);
        }

        answer %= 9;

        return answer;
    }
}
