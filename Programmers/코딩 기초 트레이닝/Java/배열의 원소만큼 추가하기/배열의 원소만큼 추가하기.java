import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        // list 생성
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                // add(): 원소 추가
                list.add(arr[i]);
            }
        }

        // 리스트 스트림 생성 -> mapToInt -> 배열 변환
        // mapToInt(): IntStream 변환 (스트림 -> 기본형 스트림 (Integer -> int))
        // toArray(): 배열 변환
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
