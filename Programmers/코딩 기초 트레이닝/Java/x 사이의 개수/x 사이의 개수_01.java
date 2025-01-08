import java.util.*;

class Solution {
    public int[] solution(String myString) {
        // 배열 스트림 생성 (문자열 분리) -> mapToInt -> 배열 변환
        // split(): 문자열 분리
        // mapToInt(): IntStream 변환 (스트림 -> 기본형 스트림 (Integer -> int))
        // toArray(): 배열 변환
        return Arrays.stream(myString.split("x", myString.length())).mapToInt(i -> i.length()).toArray();
    }
}
