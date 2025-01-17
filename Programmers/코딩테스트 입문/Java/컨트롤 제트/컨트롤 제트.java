class Solution {
    public int solution(String s) {
        int answer = 0; // 머쓱이가 구한 값

        // split(): 문자열 분리
        String[] str = s.split(" ");

        for (int i = 0; i < str.length; i++) {
            // equals(): 문자열 비교
            // "Z"일 경우
            if (str[i].equals("Z")) {
                // Integer.parseInt(): 정수 변환
                answer -= Integer.parseInt(str[i - 1]);
            } else {
                answer += Integer.parseInt(str[i]);
            }
        }

        return answer;
    }
}
