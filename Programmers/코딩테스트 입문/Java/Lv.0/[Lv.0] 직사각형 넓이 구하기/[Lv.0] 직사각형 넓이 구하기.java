class Solution {
    public int solution(int[][] dots) {
        int w = 0; // 직사각형의 가로 길이
        int h = 0; // 직사각형의 세로 길이
        int x = dots[0][0]; // x좌표
        int y = dots[0][1]; // y좌표

        for (int i = 1; i < dots.length; i++) {
            // x좌표가 다를 경우
            if (x != dots[i][0]) {
                w = Math.abs(x - dots[i][0]);
            // y좌표가 다를 경우
            } else if (y != dots[i][1]) {
                h = Math.abs(y - dots[i][1]);
            }
        }

        // 직사각형의 넓이 = 직사각형의 가로 길이 * 직사각형의 세로 길이
        return w * h;
    }
}
