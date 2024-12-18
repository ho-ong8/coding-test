import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};

        for (int i = 0; i < str_list.length; i++) {
            // equals(): 문자열 비교
            // "l"일 경우
            if (str_list[i].equals("l")) {
                // copyOfRange(array, startIndex, endIndex): startIndex(포함)부터 endIndex(불포함)까지 범위 내 배열 복사
                return Arrays.copyOfRange(str_list, 0, i);
            // "r"일 경우
            } else if (str_list[i].equals("r")) {
                return Arrays.copyOfRange(str_list, i + 1, str_list.length);
            }
        }

        return answer;
    }
}
