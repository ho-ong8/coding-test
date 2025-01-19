import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers); // 오름차순 정렬

        // 최댓값 = 배열의 마지막 원소 * 배열의 마지막 이전 원소
        return numbers[numbers.length - 1] * numbers[numbers.length - 2];
    }
}
