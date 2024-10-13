import java.util.*;

class Solution {
    public int[] solution(int n) {
        // set 생성 (중복 제거)
        Set<Integer> set = new HashSet<>();
        int num = 2; // 소인수

        // 소인수 구하기
        // 2 이상일 경우
        while (n >= 2) {
            // 소수 구하기
            // n을 num으로 나눴을 때, 나머지가 0일 경우
            if (n % num == 0) {
                // add(): 원소 추가
                n /= num;
                set.add(num);
            } else {
                num++;
            }
        }

        // 세트 스트림 생성 -> 오름차순 정렬 -> mapToInt -> 배열 변환
        // sorted(): 오름차순 정렬
        // mapToInt(): IntStream 변환 (스트림 -> 기본형 스트림 (Integer -> int))
        // toArray(): 배열 변환
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
