import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr) {
        // 기본형 스트림 생성 -> 원소 추출 -> 배열 변환
        // range(start, end): start(포함)부터 end(불포함)까지 범위 내 정수 생성
        // filter(): 조건에 해당하는 원소를 추출하여 반환
        // toArray(): 배열 변환
        int[] answer = IntStream.range(0, arr.length).filter(i -> arr[i] == 2).toArray();

        // 0일 경우
        if (answer.length == 0) {
            return new int[] {-1};
        }

        // 기본형 스트림 생성 -> 원소 매핑 -> 배열 변환
        // rangeClosed(start, end): start(포함)부터 end(포함)까지 범위 내 정수 생성
        // map(): 다른 형태의 원소로 매핑하여 반환
        // toArray(): 배열 변환
        return IntStream.rangeClosed(answer[0], answer[answer.length - 1]).map(i -> arr[i]).toArray();
    }
}
