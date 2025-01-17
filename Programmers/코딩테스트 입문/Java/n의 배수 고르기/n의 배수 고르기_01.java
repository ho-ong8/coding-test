import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        // 배열 스트림 생성 -> 원소 추출 -> 배열 변환
        // filter(): 조건에 해당하는 원소를 추출하여 반환
        // toArray(): 배열 변환
        return Arrays.stream(numlist).filter(i -> i % n == 0).toArray();
    }
}
