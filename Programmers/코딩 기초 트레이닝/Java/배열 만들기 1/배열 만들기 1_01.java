import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
        // list 생성
        List<Integer> list = new ArrayList<>();

        for (int i = k; i <= n; i += k) {
            // add(): 원소 추가
            list.add(i);
        }

        // 리스트 스트림 생성 -> mapToInt -> 배열 변환
        // mapToInt(): IntStream 변환 (스트림 -> 기본형 스트림 (Integer -> int))
        // toArray(): 배열 변환
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
