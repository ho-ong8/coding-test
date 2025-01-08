import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        // 배열 스트림 생성 -> 원소 추출 (문자열 포함 여부 확인) -> 배열 변환
        // filter(): 조건에 해당하는 원소를 추출하여 반환
        // contains(): 문자열 포함 여부 확인
        // toArray(): 배열 변환
        return Arrays.stream(strArr).filter(i -> !i.contains("ad")).toArray(String[]::new);
    }
}
