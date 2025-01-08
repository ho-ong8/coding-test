import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int start = 0; // 시작
        int end = arr.length - 1; // 마지막

        for (int i = 0; i < query.length; i++) {
            // i를 2로 나눴을 때, 나머지가 0일 경우
            if (i % 2 == 0) {
                end = start + query[i] - 1;
            } else {
                start += query[i];
            }
        }

        // copyOfRange(array, startIndex, endIndex): startIndex(포함)부터 endIndex(불포함)까지 범위 내 배열 복사
        return Arrays.copyOfRange(arr, start, end + 2);
    }
}
