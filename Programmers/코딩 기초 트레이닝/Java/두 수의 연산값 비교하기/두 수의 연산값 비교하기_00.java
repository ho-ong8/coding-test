class Solution {
    public int solution(int a, int b) {
        // Integer.parseInt(): 정수 변환
        // String.valueOf(): 문자열 변환
        int sum = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int mul = 2 * a * b;

        // a ⊕ b가 2 * a * b 이상일 경우 a ⊕ b, 아닐 경우 2 * a * b
        if (sum >= mul) {
            return sum;
        } else {
            return mul;
        }
    }
}
