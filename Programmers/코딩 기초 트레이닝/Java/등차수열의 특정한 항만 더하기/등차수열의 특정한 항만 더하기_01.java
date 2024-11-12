import java.util.stream.IntStream;

class Solution {
    public int solution(int a, int d, boolean[] included) {
        // 기본형 스트림 생성 -> 원소 매핑 -> 합계 계산
        // range(start, end): start(포함)부터 end(불포함)까지 범위 내 정수 생성
        // map(): 다른 형태의 원소로 매핑하여 반환
        // sum(): 합계 반환
        return IntStream.range(0, included.length).map(i -> included[i] ? a + (d * i) : 0).sum();
    }
}
