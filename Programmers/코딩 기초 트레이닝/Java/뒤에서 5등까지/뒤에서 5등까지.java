import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list); // 오름차순 정렬

        // copyOf(array, length): 인덱스 0부터 지정한 길이만큼 범위 내 배열 복사
        int[] answer = Arrays.copyOf(num_list, 5);

        return answer;
    }
}
