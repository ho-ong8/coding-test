import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;

        // toCharArray(): 문자 배열 변환
        char[] chr1 = before.toCharArray();
        char[] chr2 = after.toCharArray();
        Arrays.sort(chr1); // 오름차순 정렬
        Arrays.sort(chr2); // 오름차순 정렬

        // equals(): 문자열 비교
        if (Arrays.equals(chr1, chr2)) {
            answer = 1;
        }

        return answer;
    }
}
