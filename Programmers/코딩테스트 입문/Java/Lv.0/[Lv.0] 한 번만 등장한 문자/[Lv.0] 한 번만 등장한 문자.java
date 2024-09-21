import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";

        // split(): 문자열 분리
        String[] str = s.split("");
        Arrays.sort(str); // 오름차순 정렬

        for (int i = 0; i < str.length; i++) {
            int cnt = 0; // 한 번만 등장한 문자

            for (int j = 0; j < str.length; j++) {
                // equals(): 문자열 비교
                if (str[i].equals(str[j])) {
                    cnt++;
                }
            }

            // 한 번만 등장한 문자일 경우
            if (cnt == 1) {
                answer += str[i];
            }
        }

        return answer;
    }
}
