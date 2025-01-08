import java.util.*;

class Solution {
    public String[] solution(String myString) {
        // 배열 스트림 생성 (문자열 분리) -> 원소 추출 (빈 문자열 확인) -> 오름차순 정렬 -> 배열 변환
        // split(): 문자열 분리
        // filter(): 조건에 해당하는 원소를 추출하여 반환
        // isEmpty(): 문자열의 길이가 0일 경우 true 반환
        // sorted(): 오름차순 정렬
        // toArray(): 배열 변환
        return Arrays.stream(myString.split("x")).filter(i -> !i.isEmpty()).sorted().toArray(String[]::new);
    }
}
