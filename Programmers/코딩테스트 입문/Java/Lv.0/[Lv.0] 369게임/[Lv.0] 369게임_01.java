import java.util.*;

class Solution {
    public int solution(int order) {
        // 배열 스트림 생성 (문자열 분리) -> 원소 매핑 -> 원소 추출 -> 개수 계산
        // split(): 문자열 분리
        // map(): 다른 형태의 원소로 매핑하여 반환
        // filter(): 조건에 해당하는 원소를 추출하여 반환
        // count(): 개수 반환
        return (int) Arrays.stream(String.valueOf(order).split("")).map(Integer::parseInt).filter(i -> i == 3 || i == 6 || i == 9).count();
    }
}
