import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        // list 생성
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            // add(): 원소 추가
            list.add(arr[i]);
        }

        for (int i = 0; i < delete_list.length; i++) {
            // remove(): 원소 제거
            // Integer.valueOf(): 정수 변환
            list.remove(Integer.valueOf(delete_list[i]));
        }

        // 리스트 스트림 생성 -> mapToInt -> 배열 변환
        // mapToInt(): IntStream 변환 (스트림 -> 기본형 스트림 (Integer -> int))
        // toArray(): 배열 변환
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
