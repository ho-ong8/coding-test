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
            // 리스트의 마지막 원소가 작을 경우
            } else if (list.get(list.size() - 1) < arr[i]) {
                list.add(arr[i]);
            } else {
                // remove(): 원소 제거
                // size(): 컬렉션 타입 길이 반환
                list.remove(list.size() - 1);
                i--;
            }
        }

        int[] stk = new int[list.size()];
        int cnt = 0; // 인덱스

        for (int i = 0; i < list.size(); i++) {
            stk[cnt++] = list.get(i);
        }

        return stk;
    }
}
