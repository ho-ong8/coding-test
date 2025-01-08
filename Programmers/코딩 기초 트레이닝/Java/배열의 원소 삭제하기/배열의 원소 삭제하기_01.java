import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        // set 생성 (중복 제거)
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < delete_list.length; i++) {
            // add(): 원소 추가
            set.add(delete_list[i]);
        }

        // 배열 스트림 생성 -> 원소 추출 -> 배열 변환
        // filter(): 조건에 해당하는 원소를 추출하여 반환
        // toArray(): 배열 변환
        return Arrays.stream(arr).filter(i -> !set.contains(i)).toArray();
    }
}
