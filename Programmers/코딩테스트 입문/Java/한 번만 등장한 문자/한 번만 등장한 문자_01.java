import java.util.*;

class Solution {
    public String solution(String s) {
        // set 생성 (중복 제거)
        Set<String> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            // replace(target, replacement): 문자열을 다른 문자열로 치환
            // charAt(): 문자 변환
            String ss = s.replace(s.charAt(i) + "", "");
            
            if (s.length() - ss.length() == 1) {
                // add(): 원소 추가
                set.add(s.charAt(i) + "");
            }
        }

        // list 생성
        // sort(): 오름차순 정렬
        List<String> list = new ArrayList<>(set);
        Collections.sort(list);

        // join(): 문자열 병합
        return String.join("", list);
    }
}
