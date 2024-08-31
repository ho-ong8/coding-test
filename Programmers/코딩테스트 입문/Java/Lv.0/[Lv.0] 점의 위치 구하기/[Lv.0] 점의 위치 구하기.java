class Solution {
    public int solution(int[] dot) {
        int answer = 0;

        // dot[0] = x좌표, dot[1] = y좌표
        // dot[0], dot[1] 모두 양수일 경우 제1사분면
        if (dot[0] > 0 && dot[1] > 0) {
            answer = 1;
        // dot[0] 음수, dot[1] 양수일 경우 제2사분면
        } else if (dot[0] < 0 && dot[1] > 0) {
            answer = 2;
        // dot[0], dot[1] 모두 음수일 경우 제3사분면
        } else if (dot[0] < 0 && dot[1] < 0) {
            answer = 3;
        // dot[0] 양수, dot[1] 음수일 경우 제4사분면
        } else if (dot[0] > 0 && dot[1] < 0) {
            answer = 4;
        }

        return answer;
    }
}
