import java.util.*;

class Solution {
    public String solution(String my_string) {
        // toLowerCase(): 문자열 소문자 변환
        // toCharArray(): 문자 배열 변환
        char[] chr = my_string.toLowerCase().toCharArray();
        Arrays.sort(chr); // 오름차순 정렬
        return new String(chr);
    }
}
