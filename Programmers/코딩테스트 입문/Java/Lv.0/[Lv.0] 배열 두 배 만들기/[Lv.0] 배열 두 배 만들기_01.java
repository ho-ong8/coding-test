import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        // 배열 스트림 생성 -> 원소 매핑 -> 배열 변환
        // map(): 다른 형태의 원소로 매핑하여 반환
        // toArray(): 배열 변환
        return Arrays.stream(numbers).map(i -> i * 2).toArray();
    }
}
