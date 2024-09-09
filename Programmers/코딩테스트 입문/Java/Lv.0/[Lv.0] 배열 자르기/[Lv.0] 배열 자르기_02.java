import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        // 기본형 스트림 생성 -> 원소 매핑 -> 배열 변환
        // rangeClosed(start, end): start(포함)부터 end(포함)까지 범위 내 정수 생성
        // map(): 다른 형태의 원소로 매핑하여 반환
        // toArray(): 배열 변환
        return IntStream.rangeClosed(num1, num2).map(i -> numbers[i]).toArray();
    }
}
