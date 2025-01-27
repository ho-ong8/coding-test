class Solution {
    public int solution(int n) {
        int answer = 0; // 자릿수의 합

        while (n > 0) {
            answer += n % 10;
            n /= 10;

            // n % 10, n / 10 하는 이유?
            // n % 10 => 1의 자릿수 분리 (나머지)
            // n / 10 => 10의 자릿수 -> 1의 자릿수 변환 (몫)
        }

        return answer;
    }
}
