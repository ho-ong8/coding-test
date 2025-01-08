import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        // clone(): 객체 복사
        int[] answer = arr.clone();

        for (int i = 0; i < query.length; i++) {
            // i를 2로 나눴을 때, 나머지가 0일 경우
            if (i % 2 == 0) {
                // copyOfRange(array, startIndex, endIndex): startIndex(포함)부터 endIndex(불포함)까지 범위 내 배열 복사
                answer = Arrays.copyOfRange(answer, 0, query[i] + 1);
            } else {
                answer = Arrays.copyOfRange(answer, query[i], answer.length);
            }
        }

        return answer;
    }
}
