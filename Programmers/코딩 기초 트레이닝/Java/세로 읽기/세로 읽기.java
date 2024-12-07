import java.util.*;

class Solution {
    public String solution(String my_string, int m, int c) {
        // list 생성
        List<String> list = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i += m) {
            // substring(startIndex, endIndex): startIndex(포함)부터 endIndex(불포함)까지 범위 내 문자열 자르기
            String s = my_string.substring(i, i + m);

            // add(): 원소 추가
            list.add(s);
        }

        String answer = ""; // 세로로 적힌 글자

        for (String ss : list) {
            answer += ss.substring(c - 1, c);
        }

        return answer;
    }
}
