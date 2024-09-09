import java.util.*;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        // copyOfRange(array, startIndex, endIndex): startIndex(포함)부터 endIndex(불포함)까지 범위 내 배열 복사
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}
