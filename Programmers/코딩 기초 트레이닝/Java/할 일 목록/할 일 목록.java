import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        // list 생성
        List<String> list = new ArrayList<>();

        for (int i = 0; i < finished.length; i++) {
            // 아직 마치지 못했을 경우
            if (!finished[i]) {
                // add(): 원소 추가
                list.add(todo_list[i]);
            }
        }

        // toArray(): 배열 변환
        // size(): 컬렉션 타입 길이 반환
        String[] answer = list.toArray(new String[list.size()]);

        return answer;
    }
}
