import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String[] str_list, String ex) {
        // 배열 스트림 생성 -> 원소 추출 (문자열 포함 여부 확인) -> 원소 변환 (문자열 병합)
        // filter(): 조건에 해당하는 원소를 추출하여 반환
        // contains(): 문자열 포함 여부 확인
        // collect(): 원소 변환 (맵, 문자열, 컬렉션 등 자료형 변환 및 반환)
        // Collectors.joining(): 문자열 병합
        return Arrays.stream(str_list).filter(i -> !i.contains(ex)).collect(Collectors.joining());
    }
}
