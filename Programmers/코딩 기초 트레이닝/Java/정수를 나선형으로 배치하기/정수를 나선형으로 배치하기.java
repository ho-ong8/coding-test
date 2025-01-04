class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num = 1; // 정수
        int cnt = 0; // 방향
        int row = 0; // 행
        int col = 0; // 열

        // n x n 이하일 경우
        while (num <= n * n) {
            answer[row][col] = num++;

            // 오른쪽 방향일 경우
            if (cnt == 0) {
                if (col == n - 1 || answer[row][col + 1] != 0) {
                    cnt = 1;
                    row++;
                } else {
                    col++;
                }
            // 아래쪽 방향일 경우
            } else if (cnt == 1) {
                if (row == n - 1 || answer[row + 1][col] != 0) {
                    cnt = 2;
                    col--;
                } else {
                    row++;
                }
            // 왼쪽 방향일 경우
            } else if (cnt == 2) {
                if (col == 0 || answer[row][col - 1] != 0) {
                    cnt = 3;
                    row--;
                } else {
                    col--;
                }
            // 위쪽 방향일 경우
            } else if (cnt == 3) {
                if (row == 0 || answer[row - 1][col] != 0) {
                    cnt = 0;
                    col++;
                } else {
                    row--;
                }
            }
        }

        return answer;
    }
}
