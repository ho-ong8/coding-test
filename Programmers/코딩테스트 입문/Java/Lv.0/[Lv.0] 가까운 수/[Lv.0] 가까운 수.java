import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array); // 오름차순 정렬

        int answer = 0; // 가까운 수

        for (int i = 0; i < array.length; i++) {
            // Math.abs(): 절댓값 반환
            // 최솟값 = n - 배열의 첫 번째 원소
            // 최솟값이 클 경우
            if (Math.abs(n - array[0]) > Math.abs(n - array[i])) {
                array[0] = array[i];
            }
        }

        answer = array[0];
        return answer;
    }
}
