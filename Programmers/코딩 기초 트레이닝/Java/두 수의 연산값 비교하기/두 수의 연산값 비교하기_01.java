class Solution {
    public int solution(int a, int b) {
        // Math.max(): 최댓값 반환
        // Integer.parseInt(): 정수 변환
        return Math.max(Integer.parseInt(a + "" + b), 2 * a * b);

        // a + "" + b 하는 이유?
        // 문자열 변환 => 정수 + 문자열 = 문자열
    }
}
