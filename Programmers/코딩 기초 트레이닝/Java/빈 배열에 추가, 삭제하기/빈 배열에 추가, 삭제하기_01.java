import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        // stack 생성 (후입선출)
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            // true일 경우
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    // push(): 원소 추가
                    stack.push(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    // pop(): 원소 제거
                    stack.pop();
                }
            }
        }

        // 스택 스트림 생성 -> mapToInt -> 배열 변환
        // mapToInt(): IntStream 변환 (스트림 -> 기본형 스트림 (Integer -> int))
        // toArray(): 배열 변환
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}
