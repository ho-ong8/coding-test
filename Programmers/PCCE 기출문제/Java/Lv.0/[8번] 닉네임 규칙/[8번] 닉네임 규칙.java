class Solution {
    public String solution(String nickname) {
        String answer = "";

        for (int i = 0; i < nickname.length(); i++) {
            // charAt(): 문자 변환
            // 'l'일 경우
            if (nickname.charAt(i) == 'l') {
                answer += "I";
            // 'w'일 경우
            } else if (nickname.charAt(i) == 'w') {
                answer += "vv";
            // 'W'일 경우
            } else if (nickname.charAt(i) == 'W') {
                answer += "VV";
            // 'O'일 경우
            } else if (nickname.charAt(i) == 'O') {
                answer += "0";
            } else {
                answer += nickname.charAt(i);
            }
        }

        // 4보다 작을 경우
        while (answer.length() < 4) {
            answer += "o";
        }

        // 8보다 클 경우
        if (answer.length() > 8) {
            // substring(startIndex, endIndex): startIndex(포함)부터 endIndex(불포함)까지 범위 내 문자열 자르기
            answer = answer.substring(0, 8);
        }

        return answer;
    }
}
