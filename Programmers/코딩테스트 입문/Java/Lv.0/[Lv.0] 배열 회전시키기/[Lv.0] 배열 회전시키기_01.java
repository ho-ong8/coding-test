import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        // 배열 스트림 생성 -> boxed -> 원소 변환 (리스트 변환)
        // boxed(): 스트림 변환 (기본형 스트림 -> 스트림)
        // collect(): 원소 변환 (맵, 문자열, 컬렉션 등 자료형 변환 및 반환)
        // Collectors.toList(): 리스트 변환

        // boxed() 하는 이유?
        // 컬렉션 인터페이스는 객체만 저장 가능하므로 변환 필요
        // IntStream -> Stream<Integer> (int -> Integer)

        // list 생성
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());

        // equals(): 문자열 비교
        // 오른쪽으로 회전시킬 경우
        if (direction.equals("right")) {
            // add(): 원소 추가
            // remove(): 원소 제거
            // get(): 원소 반환
            // size(): 컬렉션 타입 길이 반환
            list.add(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);
        // 왼쪽으로 회전시킬 경우
        } else {
            list.add(list.size(), list.get(0));
            list.remove(0);
        }

        // 리스트 스트림 생성 -> mapToInt -> 배열 변환
        // mapToInt(): IntStream 변환 (스트림 -> 기본형 스트림 (Integer -> int))
        // toArray(): 배열 변환
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
