import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] num_list) {
        // 배열 스트림 생성 -> boxed -> 원소 변환 (리스트 변환)
        // boxed(): 스트림 변환 (기본형 스트림 -> 스트림)
        // collect(): 원소 변환 (맵, 문자열, 컬렉션 등 자료형 변환 및 반환)
        // Collectors.toList(): 리스트 변환

        // boxed() 하는 이유?
        // 컬렉션 인터페이스는 객체만 저장 가능하므로 변환 필요
        // IntStream -> Stream<Integer> (int -> Integer)

        // list 생성
        // reverse(): 반전 반환
        List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        Collections.reverse(list);

        // 리스트 스트림 생성 -> mapToInt -> 배열 변환
        // mapToInt(): IntStream 변환 (스트림 -> 기본형 스트림 (Integer -> int))
        // toArray(): 배열 변환
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
