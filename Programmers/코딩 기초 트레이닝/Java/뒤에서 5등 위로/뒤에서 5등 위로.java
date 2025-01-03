import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list); // 오름차순 정렬

        // copyOfRange(array, startIndex, endIndex): startIndex(포함)부터 endIndex(불포함)까지 범위 내 배열 복사
        int[] answer = Arrays.copyOfRange(num_list, 5, num_list.length);

        return answer;
    }
}
