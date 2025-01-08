import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int cnt = 1; // 거듭제곱

        while (cnt < arr.length) {
            cnt *= 2;
        }

        // copyOf(array, length): 인덱스 0부터 지정한 길이만큼 범위 내 배열 복사
        return Arrays.copyOf(arr, cnt);
    }
}
