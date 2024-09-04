import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        // map 생성 (키, 값 저장)
        Map<Integer, Integer> map = new HashMap<>();
        int[] answer = new int[emergency.length]; // 진료 순서
        int cnt = 1; // 응급도

        // copyOf(array, length): 인덱스 0부터 지정한 길이만큼 범위 내 배열 복사
        int[] sort = Arrays.copyOf(emergency, emergency.length);
        Arrays.sort(sort); // 오름차순 정렬

        // 배열의 원소 역순 삽입 = 배열의 마지막 원소 - i
        // 배열의 마지막 원소 = 배열의 길이 - 1
        for (int i = sort.length - 1; i >= 0; i--) {
            // put(): 키, 값 추가 및 변경
            map.put(sort[i], cnt++);
        }

        for (int i = 0; i < emergency.length; i++) {
            // get(): 키, 값 반환
            answer[i] = map.get(emergency[i]);
        }

        return answer;
    }
}
