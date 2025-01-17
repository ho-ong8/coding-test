import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        // replaceAll(regex, replacement): 문자열을 다른 문자열로 치환 (regex: 정규표현식)
        // [a-z]: a부터 z까지
        String s = my_string.replaceAll("[a-z]", "");

        // split(): 문자열 분리
        String[] str = s.split("");
        int[] answer = new int[str.length];

        for (int i = 0; i < str.length; i++) {
            // Integer.parseInt(): 정수 변환
            answer[i] = Integer.parseInt(str[i]);
        }

        Arrays.sort(answer); // 오름차순 정렬

        return answer;
    }
}
