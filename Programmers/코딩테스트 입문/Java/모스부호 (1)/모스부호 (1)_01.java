import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String letter) {
        // map 생성 (키, 값 저장)
        Map<String, String> map = new HashMap<>() {{
            // put(): 키, 값 추가 및 변경
            put(".-", "a");
            put("-...", "b");
            put("-.-.", "c");
            put("-..", "d");
            put(".", "e");
            put("..-.", "f");
            put("--.", "g");
            put("....", "h");
            put("..", "i");
            put(".---", "j");
            put("-.-", "k");
            put(".-..", "l");
            put("--", "m");
            put("-.", "n");
            put("---", "o");
            put(".--.", "p");
            put("--.-", "q");
            put(".-.", "r");
            put("...", "s");
            put("-", "t");
            put("..-", "u");
            put("...-", "v");
            put(".--", "w");
            put("-..-", "x");
            put("-.--", "y");
            put("--..", "z");
        }};

        // 배열 스트림 생성 (문자열 분리) -> 원소 매핑 -> 원소 변환 (문자열 병합)
        // split(): 문자열 분리
        // map(): 다른 형태의 원소로 매핑하여 반환
        // map(map::get): 키, 값 반환
        // collect(): 원소 변환 (맵, 문자열, 컬렉션 등 자료형 변환 및 반환)
        // Collectors.joining(): 문자열 병합
        return Arrays.stream(letter.split(" ")).map(map::get).collect(Collectors.joining());
    }
}
