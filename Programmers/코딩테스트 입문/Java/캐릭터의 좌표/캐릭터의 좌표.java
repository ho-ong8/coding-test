class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2]; // 캐릭터의 좌표

        // / 2 하는 이유?
        // 캐릭터는 항상 맵의 정 중앙 [0, 0]에서 시작한다.
        int w = board[0] / 2; // 맵의 가로 크기
        int h = board[1] / 2; // 맵의 세로 크기

        for (int i = 0; i < keyinput.length; i++) {
            // equals(): 문자열 비교
            // "right"일 경우
            if (keyinput[i].equals("right")) {
                answer[0]++;

                // 맵의 가로 크기보다 클 경우 (양수)
                if (answer[0] > w) {
                    answer[0] = w;
                }
            // "left"일 경우
            } else if (keyinput[i].equals("left")) {
                answer[0]--;

                // 맵의 가로 크기보다 작을 경우 (음수)
                if (answer[0] < -w) {
                    answer[0] = -w;
                }
            // "up"일 경우
            } else if (keyinput[i].equals("up")) {
                answer[1]++;

                // 맵의 세로 크기보다 클 경우 (양수)
                if (answer[1] > h) {
                    answer[1] = h;
                }
            // "down"일 경우
            } else if (keyinput[i].equals("down")) {
                answer[1]--;

                // 맵의 세로 크기보다 작을 경우 (음수)
                if (answer[1] < -h) {
                    answer[1] = -h;
                }
            }
        }

        return answer;
    }
}
