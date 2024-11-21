import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        // stack 생성 (후입선출)
        Stack<Integer> stack = new Stack<>();

        for (int num : arr) {
            // isEmpty(): 문자열의 길이가 0일 경우 true 반환
            // peek(): 원소 반환
            // 빈 스택이 아닐 경우, 스택의 마지막 원소가 num 이상일 경우
            while (!stack.isEmpty() && num <= stack.peek()) {
                // pop(): 원소 제거
                stack.pop();
            }

            // push(): 원소 추가
            stack.push(num);
        }

        // 스택 스트림 생성 -> mapToInt -> 배열 변환
        // mapToInt(): IntStream 변환 (스트림 -> 기본형 스트림 (Integer -> int))
        // toArray(): 배열 변환
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}
