import java.util.*;

class Solution {
    public int solution(int[] array, int height) {
        // 배열 스트림 생성 -> 원소 추출 -> 개수 계산
        // filter(): 조건에 해당하는 원소를 추출하여 반환
        // count(): 개수 반환
        return (int) Arrays.stream(array).filter(i -> i > height).count();
    }
}
