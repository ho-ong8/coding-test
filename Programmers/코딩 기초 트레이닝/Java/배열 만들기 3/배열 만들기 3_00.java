import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        // list 생성
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            // copyOfRange(array, startIndex, endIndex): startIndex(포함)부터 endIndex(불포함)까지 범위 내 배열 복사
            int[] num = Arrays.copyOfRange(arr, intervals[i][0], intervals[i][1] + 1);

            for (int j = 0; j < num.length; j++) {
                // add(): 원소 추가
                list.add(num[j]);
            }
        }

        // 리스트 스트림 생성 -> mapToInt -> 배열 변환
        // mapToInt(): IntStream 변환 (스트림 -> 기본형 스트림 (Integer -> int))
        // toArray(): 배열 변환
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
