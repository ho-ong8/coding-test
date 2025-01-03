import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        // list 생성
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            // add(): 원소 추가
            list.add(arr[i]);
        }

        for (int i = 0; i < delete_list.length; i++) {
            // remove(): 원소 제거
            // Integer.valueOf(): 정수 변환
            list.remove(Integer.valueOf(delete_list[i]));
        }

        // size(): 컬렉션 타입 길이 반환
        int[] answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            // get(): 원소 반환
            answer[i] = list.get(i);
        }

        return answer;
    }
}
