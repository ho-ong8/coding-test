import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0; // 7의 개수

        // toString(): 문자열 변환
        String s = Arrays.toString(array);

        for (int i = 0; i < s.length(); i++) {
            // charAt(): 문자 변환
            // '7'일 경우
            if (s.charAt(i) == '7') {
                answer++;
            }
        }

        return answer;
    }
}
