class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            // split(): 문자열 분리
            String[] str = quiz[i].split(" ");

            // equals(): 문자열 비교
            // "+"일 경우 덧셈
            if (str[1].equals("+")) {
                // Integer.parseInt(): 정수 변환
                // 수식이 옳을 경우 "O", 틀릴 경우 "X"
                if (Integer.parseInt(str[0]) + Integer.parseInt(str[2]) == Integer.parseInt(str[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            // "-"일 경우 뺄셈
            } else if (str[1].equals("-")) {
                if (Integer.parseInt(str[0]) - Integer.parseInt(str[2]) == Integer.parseInt(str[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }

        return answer;
    }
}
