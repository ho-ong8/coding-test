import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers); // 오름차순 정렬
        int num1 = numbers[0] * numbers[1]; // 최댓값 (음수)
        int num2 = numbers[numbers.length - 1] * numbers[numbers.length - 2]; // 최댓값 (양수)

        // num1이 클 경우 num1, 아닐 경우 num2
        return num1 > num2 ? num1 : num2;
    }
}
