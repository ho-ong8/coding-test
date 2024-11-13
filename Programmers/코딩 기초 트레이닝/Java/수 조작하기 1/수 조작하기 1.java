class Solution {
    public int solution(int n, String control) {
        int answer = n; // 가장 마지막 값

        // split(): 문자열 분리
        String[] str = control.split("");

        for (int i = 0; i < str.length; i++) {
            // equals(): 문자열 비교
            // "w"일 경우 1 증가
            if (str[i].equals("w")) {
                answer += 1;
            // "s"일 경우 1 감소
            } else if (str[i].equals("s")) {
                answer -= 1;
            // "d"일 경우 10 증가
            } else if (str[i].equals("d")) {
                answer += 10;
            // "a"일 경우 10 감소
            } else if (str[i].equals("a")) {
                answer -= 10;
            }
        }

        return answer;
    }
}
