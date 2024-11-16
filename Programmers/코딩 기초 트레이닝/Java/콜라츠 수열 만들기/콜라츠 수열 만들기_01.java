import java.util.*;

class Solution {
    public int[] solution(int n) {
        // list 생성
        // add(): 원소 추가
        List<Integer> list = new ArrayList<>();
        list.add(n);

        // 1이 아닐 경우
        while (n != 1) {
            // n을 2로 나눴을 때, 나머지가 0일 경우 짝수, 아닐 경우 홀수
            // 짝수일 경우 n / 2, 홀수일 경우 n * 3 + 1
            n = n % 2 == 0 ? n / 2 : n * 3 + 1;

            list.add(n);
        }

        // 리스트 스트림 생성 -> mapToInt -> 배열 변환
        // mapToInt(): IntStream 변환 (스트림 -> 기본형 스트림 (Integer -> int))
        // toArray(): 배열 변환
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
