import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string, int[] index_list) {
        // 배열 스트림 생성 -> 스트림 변환 -> 원소 변환 (문자열 병합)
        // mapToObj(): 스트림 변환 (기본형 스트림 -> 스트림)
        // collect(): 원소 변환 (맵, 문자열, 컬렉션 등 자료형 변환 및 반환)
        // Collectors.joining(): 문자열 병합
        return Arrays.stream(index_list).mapToObj(i -> String.valueOf(my_string.charAt(i))).collect(Collectors.joining());
    }
}
