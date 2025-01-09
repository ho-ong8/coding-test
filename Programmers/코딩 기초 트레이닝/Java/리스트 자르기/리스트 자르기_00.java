import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        // list 생성
        List<Integer> list = new ArrayList<>();

        // [a, b, c]
        // a = slicer[0], b = slicer[1], c = slicer[2]
        // n이 1일 경우
        if (n == 1) {
            for (int i = 0; i <= slicer[1]; i++) {
                // add(): 원소 추가
                list.add(num_list[i]);
            }
        // n이 2일 경우
        } else if (n == 2) {
            for (int i = slicer[0]; i < num_list.length; i++) {
                list.add(num_list[i]);
            }
        // n이 3일 경우
        } else if (n == 3) {
            for (int i = slicer[0]; i <= slicer[1]; i++) {
                list.add(num_list[i]);
            }
        // n이 4일 경우
        } else if (n == 4) {
            for (int i = slicer[0]; i <= slicer[1]; i += slicer[2]) {
                list.add(num_list[i]);
            }
        }

        // 리스트 스트림 생성 -> mapToInt -> 배열 변환
        // mapToInt(): IntStream 변환 (스트림 -> 기본형 스트림 (Integer -> int))
        // toArray(): 배열 변환
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
