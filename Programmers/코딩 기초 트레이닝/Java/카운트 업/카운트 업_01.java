import java.util.stream.IntStream;

class Solution {
    public int[] solution(int start_num, int end_num) {
        // 기본형 스트림 생성 -> 배열 변환
        // rangeClosed(start, end): start(포함)부터 end(포함)까지 범위 내 정수 생성
        // toArray(): 배열 변환
        return IntStream.rangeClosed(start_num, end_num).toArray();
    }
}
