import java.util.*;

class Solution {
    public double solution(int[] numbers) {
        // 배열 스트림 생성 -> 평균 계산 -> 대체 값 반환
        // average(): 평균 반환
        // orElse(): 객체가 빈 경우 대체 값 반환
        return Arrays.stream(numbers).average().orElse(0);
    }
}
