import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];

        for (int i = 0; i < my_string.length(); i++) {
            // substring(startIndex, endIndex): startIndex(포함)부터 endIndex(불포함)까지 범위 내 문자열 자르기
            answer[i] = my_string.substring(i);
        }

        Arrays.sort(answer); // 오름차순 정렬

        return answer;
    }
}
