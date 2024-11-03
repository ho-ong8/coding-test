import java.util.*;

class Solution {
    public int solution(String before, String after) {
        // toCharArray(): 문자 배열 변환
        char[] chr1 = before.toCharArray();
        char[] chr2 = after.toCharArray();

        Arrays.sort(chr1); // 오름차순 정렬
        Arrays.sort(chr2); // 오름차순 정렬

        // equals(): 문자열 비교
        // 만들 수 있을 경우 1, 없을 경우 0
        return new String(chr1).equals(new String(chr2)) ? 1 : 0;
    }
}
