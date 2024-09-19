import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {
        // 배열 스트림 생성 (문자열 분리) -> 중복 제거 -> 원소 변환 (문자열 병합)
        // split(): 문자열 분리
        // distinct(): 중복 제거
        // collect(): 원소 변환 (맵, 문자열, 컬렉션 등 자료형 변환 및 반환)
        // Collectors.joining(): 문자열 병합
        return Arrays.stream(my_string.split("")).distinct().collect(Collectors.joining());
    }
}
