import java.util.stream.IntStream;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        // compare(): 문자열 비교
        // 문자열의 사전순 값 비교 => 값이 같을 경우 0, 클 경우 1, 작을 경우 -1 반환
        int answer = Integer.compare(arr1.length, arr2.length);

        // 0일 경우
        if (answer == 0) {
            // 기본형 스트림 생성 -> 합계 계산
            // of(): 지정한 정수 생성
            // sum(): 합계 반환
            answer = Integer.compare(IntStream.of(arr1).sum(), IntStream.of(arr2).sum());
        }

        return answer;
    }
}
