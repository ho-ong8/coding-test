class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;

        if (ineq.equals(">")) {
            // ">", "="일 경우
            if (eq.equals("=")) {
                // n이 m 이상일 경우 1, 아닐 경우 0
                answer = n >= m ? 1 : 0;
            // ">", "!"일 경우
            } else if (eq.equals("!")) {
                // n이 클 경우 1, 아닐 경우 0
                answer = n > m ? 1 : 0;
            }
        } else if (ineq.equals("<")) {
            // "<", "="일 경우
            if (eq.equals("=")) {
                // m이 n 이상일 경우 1, 아닐 경우 0
                answer = n <= m ? 1 : 0;
            // "<", "!"일 경우
            } else if (eq.equals("!")) {
                // m이 클 경우 1, 아닐 경우 0
                answer = n < m ? 1 : 0;
            }
        }

        return answer;
    }
}
