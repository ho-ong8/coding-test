import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        // list 생성
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            for (int j = intervals[i][0]; j <= intervals[i][1]; j++) {
                // add(): 원소 추가
                list.add(arr[j]);
            }
        }

        // 리스트 스트림 생성 -> mapToInt -> 배열 변환
        // mapToInt(): IntStream 변환 (스트림 -> 기본형 스트림 (Integer -> int))
        // toArray(): 배열 변환
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
