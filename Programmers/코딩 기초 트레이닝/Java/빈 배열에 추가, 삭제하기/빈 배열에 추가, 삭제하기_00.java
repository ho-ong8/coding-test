import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        // list 생성
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            // true일 경우
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    // add(): 원소 추가
                    list.add(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    // remove(): 원소 제거
                    // size(): 컬렉션 타입 길이 반환
                    list.remove(list.size() - 1);
                }
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            // get(): 원소 반환
            answer[i] = list.get(i);
        }

        return answer;
    }
}
