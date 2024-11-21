import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        // list 생성
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < 64; i++) {
            // Integer.parseInt(): 정수 변환
            // Integer.toBinaryString(): 2진수 변환
            int num = Integer.parseInt(Integer.toBinaryString(i)) * 5; // 정수

            // l 이하, r 이상일 경우
            if (l <= num && num <= r) {
                // add(): 원소 추가
                list.add(num);
            }
        }

        // 리스트 스트림 생성 -> mapToInt -> 배열 변환
        // mapToInt(): IntStream 변환 (스트림 -> 기본형 스트림 (Integer -> int))
        // toArray(): 배열 변환
        // isEmpty(): 문자열의 길이가 0일 경우 true 반환
        return list.isEmpty() ? new int[] {-1} : list.stream().mapToInt(Integer::intValue).toArray();
    }
}
