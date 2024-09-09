import java.util.stream.Collectors;

class Solution {
    public String solution(int age) {
        // 스트림 변환 -> 원소 변환 (문자열 병합)
        // chars(): 스트림 변환 (문자 -> 스트림)
        // mapToObj(): 스트림 변환 (기본형 스트림 -> 스트림)
        // collect(): 원소 변환 (맵, 문자열, 컬렉션 등 자료형 변환 및 반환)
        // Collectors.joining(): 문자열 병합
        return String.valueOf(age).chars().mapToObj(i -> String.valueOf((char) (i + 49))).collect(Collectors.joining());
    }
}
