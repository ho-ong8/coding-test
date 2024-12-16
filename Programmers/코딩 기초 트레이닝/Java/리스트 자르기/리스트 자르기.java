import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        // list 생성
        List<Integer> list = new ArrayList<>();

        // n이 1일 경우
        if (n == 1) {
            for (int i = 0; i <= slicer[1]; i++) {
                // add(): 원소 추가
                list.add(num_list[i]);
            }
        // n이 2일 경우
        } else if (n == 2) {
            for (int i = slicer[0]; i < num_list.length; i++) {
                list.add(num_list[i]);
            }
        // n이 3일 경우
        } else if (n == 3) {
            for (int i = slicer[0]; i <= slicer[1]; i++) {
                list.add(num_list[i]);
            }
        // n이 4일 경우
        } else if (n == 4) {
            for (int i = slicer[0]; i <= slicer[1]; i += slicer[2]) {
                list.add(num_list[i]);
            }
        }

        // size(): 컬렉션 타입 길이 반환
        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            // get(): 원소 반환
            answer[i] = list.get(i);
        }

        return answer;
    }
}
