class Solution {
    public int solution(int num1, int num2) {
        // 나눗셈의 결괏값 중 실수 존재 => double형 실수 변환
        // 정수 부분 반환 => int형 정수 변환
        return (int) ((double) num1 / num2 * 1000);
    }
}
