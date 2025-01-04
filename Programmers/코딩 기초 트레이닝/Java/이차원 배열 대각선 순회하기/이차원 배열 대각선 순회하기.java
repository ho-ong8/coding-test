class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0; // 배열의 합

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                // k 이하일 경우
                if (i + j <= k) {
                    answer += board[i][j];
                }
            }
        }

        return answer;
    }
}
