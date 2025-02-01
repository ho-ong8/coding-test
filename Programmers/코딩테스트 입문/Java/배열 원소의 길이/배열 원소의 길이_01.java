import java.util.*;

class Solution {
    public int[] solution(String[] strlist) {
        // 배열 스트림 생성 -> mapToInt -> 배열 변환
        // mapToInt(): IntStream 변환 (스트림 -> 기본형 스트림 (Integer -> int))
        // mapToInt(String::length): 문자열 길이 반환
        // toArray(): 배열 변환
        return Arrays.stream(strlist).mapToInt(String::length).toArray();
    }
}
