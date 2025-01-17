import java.util.*;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array); // 오름차순 정렬

        // 중앙값 = 배열의 길이 / 2
        return array[array.length / 2];
    }
}
