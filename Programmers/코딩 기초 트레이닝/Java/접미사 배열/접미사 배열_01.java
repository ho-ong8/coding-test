import java.util.stream.IntStream;

class Solution {
    public String[] solution(String my_string) {
        // 기본형 스트림 생성 -> 스트림 변환 -> 오름차순 정렬 -> 배열 변환
        // range(start, end): start(포함)부터 end(불포함)까지 범위 내 정수 생성
        // mapToObj(): 스트림 변환 (기본형 스트림 -> 스트림)
        // mapToObj(String::substring): 문자열 자르기
        // sorted(): 오름차순 정렬
        // toArray(): 배열 변환
        return IntStream.range(0, my_string.length()).mapToObj(my_string::substring).sorted().toArray(String[]::new);
    }
}
