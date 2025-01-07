import java.util.stream.IntStream;

class Solution {
    public int solution(int[] num_list, int n) {
        // 기본형 스트림 생성 -> 원소 매치
        // of(): 지정한 정수 생성
        // anyMatch(): 조건 해당 여부 확인 (일부 원소)
        return IntStream.of(num_list).anyMatch(i -> i == n) ? 1 : 0;
    }
}
