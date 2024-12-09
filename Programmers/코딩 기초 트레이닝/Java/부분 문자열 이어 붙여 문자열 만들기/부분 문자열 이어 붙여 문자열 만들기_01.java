import java.util.stream.*;

class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        // 기본형 스트림 생성 -> 스트림 변환 (문자열 자르기) -> 원소 변환 (문자열 병합)
        // range(start, end): start(포함)부터 end(불포함)까지 범위 내 정수 생성
        // mapToObj(): 스트림 변환 (기본형 스트림 -> 스트림)
        // substring(startIndex, endIndex): startIndex(포함)부터 endIndex(불포함)까지 범위 내 문자열 자르기
        // collect(): 원소 변환 (맵, 문자열, 컬렉션 등 자료형 변환 및 반환)
        // Collectors.joining(): 문자열 병합
        return IntStream.range(0, my_strings.length).mapToObj(i -> my_strings[i].substring(parts[i][0], parts[i][1] + 1)).collect(Collectors.joining());
    }
}
