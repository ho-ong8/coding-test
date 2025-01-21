class Solution {
    public String solution(String rsp) {
        String answer = ""; // 모두 이기는 경우

        // split(): 문자열 분리
        String[] str = rsp.split("");

        for (int i = 0; i < rsp.length(); i++) {
            // equals(): 문자열 비교
            // "0"일 경우 "5"
            if (str[i].equals("0")) {
                answer += "5";
            // "2"일 경우 "0"
            } else if (str[i].equals("2")) {
                answer += "0";
            // "5"일 경우 "2"
            } else if (str[i].equals("5")) {
                answer += "2";
            }
        }

        return answer;
    }
}
