import java.util.*;

class Solution {
    public String[] solution(String myString) {
        // list 생성
        List<String> list = new ArrayList<>();

        // split(): 문자열 분리
        String[] str = myString.split("x");

        for (int i = 0; i < str.length; i++) {
            // isEmpty(): 문자열의 길이가 0일 경우 true 반환
            // 빈 문자열이 아닐 경우
            if (!str[i].isEmpty()) {
                // add(): 원소 추가
                list.add(str[i]);
            }
        }

        // toArray(): 배열 변환
        // size(): 컬렉션 타입 길이 반환
        String[] answer = list.toArray(new String[list.size()]);

        Arrays.sort(answer); // 오름차순 정렬

        return answer;
    }
}
