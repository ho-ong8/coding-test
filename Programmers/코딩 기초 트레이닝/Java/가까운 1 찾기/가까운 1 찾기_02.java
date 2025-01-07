import java.util.stream.IntStream;

class Solution {
    public int solution(int[] arr, int idx) {
        // 기본형 스트림 생성 -> 원소 추출 -> 첫 번째 원소 반환 -> 대체 값 반환
        // range(start, end): start(포함)부터 end(불포함)까지 범위 내 정수 생성
        // filter(): 조건에 해당하는 원소를 추출하여 반환
        // findFirst(): filter 조건에 해당하는 첫 번째 원소 반환
        // orElse(): 객체가 빈 경우 대체 값 반환
        return IntStream.range(idx, arr.length).filter(i -> arr[i] == 1).findFirst().orElse(-1);
    }
}
