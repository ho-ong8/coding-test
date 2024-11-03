import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";

        // toLowerCase(): 문자열 소문자 변환
        // split(): 문자열 분리
        String[] str = my_string.toLowerCase().split("");

        Arrays.sort(str); // 오름차순 정렬

        for (int i = 0; i < str.length; i++) {
            answer += str[i];
        }

        return answer;
    }
}
