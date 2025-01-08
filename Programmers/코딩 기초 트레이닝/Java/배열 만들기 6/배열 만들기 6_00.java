import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        // list 생성
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            // isEmpty(): 문자열의 길이가 0일 경우 true 반환
            // 빈 리스트일 경우
            if (list.isEmpty()) {
                // add(): 원소 추가
                list.add(arr[i]);
            // 리스트의 마지막 원소와 배열의 원소가 같을 경우
            } else if (list.get(list.size() - 1) == arr[i]) {
                // remove(): 원소 제거
                // size(): 컬렉션 타입 길이 반환
                list.remove(list.size() - 1);
            } else {
                list.add(arr[i]);
            }
        }

        int[] answer = new int[list.size()];

        // 리스트의 길이가 0일 경우
        if (list.size() == 0) {
            answer = new int[] {-1};
        }

        for (int i = 0; i < list.size(); i++) {
            // get(): 원소 반환
            answer[i] = list.get(i);
        }

        return answer;
    }
}
