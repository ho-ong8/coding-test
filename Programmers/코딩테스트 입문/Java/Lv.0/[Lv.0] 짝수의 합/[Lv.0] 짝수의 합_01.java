import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        // 기본형 스트림 생성 -> 원소 추출 -> 합계 계산
        // rangeClosed(start, end): start(포함)부터 end(포함)까지 범위 내 정수 생성
        // filter(): 조건에 해당하는 원소를 추출하여 반환
        // sum(): 합계 반환
        return IntStream.rangeClosed(0, n).filter(i -> i % 2 == 0).sum();
    }
}
