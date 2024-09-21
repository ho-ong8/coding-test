import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        // 배열 스트림 생성 (문자열 분리) -> 원소 변환 (리스트 변환)
        // split(): 문자열 분리
        // collect(): 원소 변환 (맵, 문자열, 컬렉션 등 자료형 변환 및 반환)
        // Collectors.toList(): 리스트 변환

        // list 생성
        // swap(): 원소 교환
        List<String> list = Arrays.stream(my_string.split("")).collect(Collectors.toList());
        Collections.swap(list, num1, num2);

        // join(): 문자열 병합
        return String.join("", list);
    }
}
