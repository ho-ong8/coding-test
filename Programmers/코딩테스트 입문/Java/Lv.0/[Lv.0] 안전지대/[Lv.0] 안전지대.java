import java.util.*;

class Solution {
    public int solution(int[][] board) {
        // list 생성
        List<int[]> list = new ArrayList<>();
        int answer = 0; // 안전한 지역의 칸 수
        int[] x = {0, 1, -1, 0, -1, 1, 1, -1}; // x좌표
        int[] y = {1, 0, 0, -1, -1, 1, -1, 1}; // y좌표

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                // 위험지역일 경우
                if (board[i][j] == 1) {
                    int[] num = {i, j}; // 위험지역 좌표

                    // add(): 원소 추가
                    list.add(num);
                }
            }
        }

        // size(): 컬렉션 타입 길이 반환
        for (int a = 0; a < list.size(); a++) {
            int i1 = list.get(a)[0]; // 위험지역 x좌표
            int j1 = list.get(a)[1]; // 위험지역 y좌표

            for (int b = 0; b < 8; b++) {
                int i2 = x[b] + i1; // x좌표 + 위험지역 x좌표
                int j2 = y[b] + j1; // y좌표 + 위험지역 y좌표

                // 지도 내 있을 경우
                if (i2 >= 0 && j2 >= 0 && i2 <= board.length - 1 && j2 <= board.length - 1) {
                    board[i2][j2] = 1; // 위험지역
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                // 안전지역일 경우
                if (board[i][j] == 0) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
