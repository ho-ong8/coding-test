import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        // 배열 스트림 생성 -> 오름차순 정렬 -> 원소 선택 -> 배열 변환
        // sorted(): 오름차순 정렬
        // limit(): 시작 부분부터 지정한 개수만큼 선택 후 원소 반환
        // toArray(): 배열 변환
        return Arrays.stream(num_list).sorted().limit(5).toArray();
    }
}
