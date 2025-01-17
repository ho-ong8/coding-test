class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int x1 = dots[0][0], x2 = dots[1][0], x3 = dots[2][0], x4 = dots[3][0]; // x좌표
        int y1 = dots[0][1], y2 = dots[1][1], y3 = dots[2][1], y4 = dots[3][1]; // y좌표

        // 기울기 = (y₂ - y₁) / (x₂ - x₁)
        double num1 = (double) (y2 - y1) / (x2 - x1);
        double num2 = (double) (y4 - y3) / (x4 - x3);
        double num3 = (double) (y3 - y1) / (x3 - x1);
        double num4 = (double) (y2 - y4) / (x2 - x4);
        double num5 = (double) (y4 - y1) / (x4 - x1);
        double num6 = (double) (y2 - y3) / (x2 - x3);

        // 기울기가 같을 경우
        if (num1 == num2 || num3 == num4 || num5 == num6) {
            answer = 1;
        }

        return answer;
    }
}
