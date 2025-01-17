import java.util.*;

class Solution {
    public int[] solution(int n) {
        // list 생성
        List<Integer> list = new ArrayList<>();

        // 소인수 구하기
        for (int i = 2; i <= n; i++) {
            // 소수 구하기
            // n을 i로 나눴을 때, 나머지가 0일 경우
            if (n % i == 0) {
                while (n % i == 0) {
                    n /= i;
                }

                // add(): 원소 추가
                list.add(i);
            }
        }

        // 리스트 스트림 생성 -> mapToInt -> 배열 변환
        // mapToInt(): IntStream 변환 (스트림 -> 기본형 스트림 (Integer -> int))
        // toArray(): 배열 변환
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
