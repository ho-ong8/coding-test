import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        // list 생성
        List<String> list = new ArrayList<>();

        for (int i = 0; i < strArr.length; i++) {
            // contains(): 문자열 포함 여부 확인
            // "ad"가 포함되어 있을 경우
            if (!strArr[i].contains("ad")) {
                // add(): 원소 추가
                list.add(strArr[i]);
            }
        }

        // toArray(): 배열 변환
        // size(): 컬렉션 타입 길이 반환
        return list.toArray(new String[list.size()]);
    }
}
