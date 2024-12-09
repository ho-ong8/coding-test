import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        // 배열 스트림 생성 -> mapToInt (문자열 자르기) -> 원소 추출 -> 배열 변환
        // mapToInt(): IntStream 변환 (스트림 -> 기본형 스트림 (Integer -> int))
        // substring(startIndex, endIndex): startIndex(포함)부터 endIndex(불포함)까지 범위 내 문자열 자르기
        // filter(): 조건에 해당하는 원소를 추출하여 반환
        // toArray(): 배열 변환
        return Arrays.stream(intStrs).mapToInt(i -> Integer.parseInt(i.substring(s, s + l))).filter(i -> i > k).toArray();
    }
}
