class Solution {
    public int[] solution(String route) {
        int east = 0;
        int north = 0;
        int[] answer = new int [2];

        for (int i = 0; i < route.length(); i++) {
            // charAt(): 문자 변환
            switch (route.charAt(i)) {
                // 'N'일 경우
                case 'N':
                    north++;
                    break;
                // 'S'일 경우
                case 'S':
                    north--;
                    break;
                // 'E'일 경우
                case 'E':
                    east++;
                    break;
                // 'W'일 경우
                case 'W':
                    east--;
                    break;
            }
        }

        answer[0] = east;
        answer[1] = north;

        return answer;
    }
}
