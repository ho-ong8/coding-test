import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        // copyOfRange(array, startIndex, endIndex): startIndex(포함)부터 endIndex(불포함)까지 범위 내 배열 복사
        return Arrays.copyOfRange(num_list, n - 1, num_list.length);
    }
}
