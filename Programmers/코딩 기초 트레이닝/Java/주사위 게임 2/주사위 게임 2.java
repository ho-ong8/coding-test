class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;

        // 세 숫자가 모두 다를 경우
        if (a != b && a != c && b != c) {
            // a + b + c
            answer = a + b + c;
        // 세 숫자가 모두 같을 경우
        } else if (a == b && a == c) {
            // (a + b + c) × (a² + b² + c²) × (a³ + b³ + c³)
            answer = (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
        // 두 숫자가 같고, 나머지 숫자가 다를 경우
        } else {
            // (a + b + c) × (a² + b² + c²)
            answer = (a + b + c) * (a * a + b * b + c * c);
        }

        return answer;
    }
}
