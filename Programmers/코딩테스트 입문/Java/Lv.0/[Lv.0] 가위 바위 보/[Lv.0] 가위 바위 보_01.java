import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String rsp) {
        // 배열 스트림 생성 (문자열 분리) -> 원소 매핑 (문자열 비교) -> 원소 변환 (문자열 병합)
        // split(): 문자열 분리
        // equals(): 문자열 비교
        // map(): 다른 형태의 원소로 매핑하여 반환
        // collect(): 원소 변환 (맵, 문자열, 컬렉션 등 자료형 변환 및 반환)
        // Collectors.joining(): 문자열 병합
        return Arrays.stream(rsp.split("")).map(i -> i.equals("0") ? "5" : i.equals("5") ? "2" : "0").collect(Collectors.joining());
    }
}
