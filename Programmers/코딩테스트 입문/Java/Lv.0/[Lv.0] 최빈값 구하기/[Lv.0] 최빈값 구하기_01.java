import java.util.*;

class Solution {
    public int solution(int[] array) {
        // map 생성 (키, 값 저장)
        Map<Integer, Integer> map = new HashMap<>();
        int answer = 0; // 최빈값
        int max = 0; // 최댓값

        for (int num : array) {
            // 빈도수 구하기
            // getOrDefault(key, default): 찾는 값이 있을 경우 key 값 반환, 없을 경우 default 값 반환
            int cnt = map.getOrDefault(num, 0) + 1; // 빈도수

            // 최빈값 구하기
            // 빈도수가 클 경우 (최빈값 1개)
            if (max < cnt) {
                max = cnt; // 최댓값 변경
                answer = num;
            // 최댓값과 빈도수가 같을 경우 (최빈값 여러 개)
            } else if (max == cnt) {
                answer = -1;
            }

            // put(): 키, 값 추가 및 변경
            map.put(num, cnt);
        }

        return answer;
    }
}
