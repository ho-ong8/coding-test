import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // 배열 스트림 생성 -> mapToInt (배열 스트림 생성 -> 원소 추출 -> 최솟값 반환 -> 대체 값 반환) -> 배열 변환
        // mapToInt(): IntStream 변환 (스트림 -> 기본형 스트림 (Integer -> int))
        // filter(): 조건에 해당하는 원소를 추출하여 반환
        // min(): 최솟값 반환
        // orElse(): 객체가 빈 경우 대체 값 반환
        // toArray(): 배열 변환
        return Arrays.stream(queries).mapToInt(q -> {
            // [s, e, k]
            // s = q[0], e = q[1], k = q[2]
            // i 구하기 (s ≤ i ≤ e, i > k)
            int min = Arrays.stream(arr, q[0], q[1] + 1).filter(i -> i > q[2]).min().orElse(-1); // 최솟값

            // Integer.MAX_VALUE: 정수 최댓값
            // 최솟값과 최댓값이 같을 경우 -1, 아닐 경우 최솟값
            return min == Integer.MAX_VALUE ? -1 : min;
        }).toArray();
    }
}
