import java.util.*;

class Solution {
    public String solution(String letter) {
        // map 생성 (키, 값 저장)
        Map<String, String> map = new HashMap<>() {{
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

        String answer = ""; // 해독된 모스부호

        // split(): 문자열 분리
        String[] str = letter.split(" ");

        for (String s : str) {
            // get(): 키, 값 반환
            answer += map.get(s);
        }

        return answer;
    }
}
