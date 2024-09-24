class Solution {
    public int solution(int num, int k) {
        int answer = 0; // 자릿수

        // String.valueOf(): 문자열 변환
        // split(): 문자열 분리
        String[] str = String.valueOf(num).split("");

        for (int i = 0; i < str.length; i++) {
            // equals(): 문자열 비교
            if (str[i].equals(String.valueOf(k))) {
                answer = i + 1;
                break;
            } else {
                answer = -1;
            }
        }

        return answer;
    }
}
