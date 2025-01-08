import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        // stack 생성 (후입선출)
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            // isEmpty(): 문자열의 길이가 0일 경우 true 반환
            // peek(): 원소 반환
            // 빈 스택이 아니면서, 배열의 원소와 스택의 마지막 원소가 같을 경우
            if (!stack.isEmpty() && arr[i] == stack.peek()) {
                // pop(): 원소 제거
                stack.pop();
            } else {
                // push(): 원소 추가
                stack.push(arr[i]);
            }
        }

        // 스택 스트림 생성 -> mapToInt -> 배열 변환
        // mapToInt(): IntStream 변환 (스트림 -> 기본형 스트림 (Integer -> int))
        // toArray(): 배열 변환
        // isEmpty(): 문자열의 길이가 0일 경우 true 반환
        return stack.isEmpty() ? new int[] {-1} : stack.stream().mapToInt(Integer::intValue).toArray();
    }
}
