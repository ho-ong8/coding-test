class Solution {
    public int solution(int a, int b) {
        int answer = 0; // 점수

        // 두 숫자가 모두 홀수일 경우
        if (a % 2 != 0 && b % 2 != 0) {
            // Math.pow(): 거듭제곱 반환
            // a² + b²
            answer = (int) (Math.pow(a, 2) + Math.pow(b, 2));
        // 두 숫자가 모두 홀수가 아닐 경우
        } else if (a % 2 == 0 && b % 2 == 0) {
            // Math.abs(): 절댓값 반환
            // |a - b|
            answer = Math.abs(a - b);
        // 두 숫자 중 하나만 홀수일 경우
        } else {
            // 2 x (a + b)
            answer = 2 * (a + b);
        }

        return answer;
    }
}
