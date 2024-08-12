class Solution {
    public int solution(int num1, int num2) {
        // 나눗셈 전 1000을 먼저 곱할 경우 자료형 변환 X
        return num1 * 1000 / num2;
    }
}
