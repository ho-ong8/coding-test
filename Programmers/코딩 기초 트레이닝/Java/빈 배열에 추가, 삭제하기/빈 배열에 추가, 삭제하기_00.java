import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        // list 생성
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            // true일 경우
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    // add(): 원소 추가
                    list.add(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    // remove(): 원소 제거
                    // size(): 컬렉션 타입 길이 반환
                    list.remove(list.size() - 1);
                }
            }
        }

        // 리스트 스트림 생성 -> mapToInt -> 배열 변환
        // mapToInt(): IntStream 변환 (스트림 -> 기본형 스트림 (Integer -> int))
        // toArray(): 배열 변환
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
