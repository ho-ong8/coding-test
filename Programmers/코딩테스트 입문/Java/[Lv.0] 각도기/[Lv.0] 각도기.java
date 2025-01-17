class Solution {
    public int solution(int angle) {
        int answer = 0;

        // 0도 초과 90도 미만일 경우 예각
        if (0 < angle && angle < 90) {
            answer = 1;
        // 90도일 경우 직각
        } else if (angle == 90) {
            answer = 2;
        // 90도 초과 180도 미만일 경우 둔각
        } else if (90 < angle && angle < 180) {
            answer = 3;
        // 180도일 경우 평각
        } else if (angle == 180) {
            answer = 4;
        }

        return answer;
    }
}
