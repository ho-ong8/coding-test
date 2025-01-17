import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] num_list) {
        // 기본형 스트림 생성 (배열 스트림 생성 -> 원소 추출 -> 개수 계산) -> 배열 변환
        // of(): 지정한 정수 생성
        // filter(): 조건에 해당하는 원소를 추출하여 반환
        // count(): 개수 반환
        // toArray(): 배열 변환
        return IntStream.of(
            (int) Arrays.stream(num_list).filter(i -> i % 2 == 0).count(), // 짝수
            (int) Arrays.stream(num_list).filter(i -> i % 2 == 1).count() // 홀수
        ).toArray();
    }
}
