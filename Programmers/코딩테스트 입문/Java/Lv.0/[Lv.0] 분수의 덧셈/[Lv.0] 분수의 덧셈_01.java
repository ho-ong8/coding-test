class Solution {
    // 최대공약수 구하기
    // 최대공약수(GCD, Greatest Common Divisor)
    public int GCD(int num1, int num2) {
        // 분자와 분모를 나눴을 때, 나머지가 0일 경우
        if (num1 % num2 == 0) {
            return num2;
        }

        return GCD(num2, num1 % num2);
    }

    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        numer1 *= denom2;
        numer2 *= denom1;

        // 분자와 분모 구하기 (통분)
        // 분자 = 분자1 * 분모2 + 분자2 * 분모1
        // 분모 = 분모1 * 분모2
        int[] answer = new int[] {numer1 + numer2, denom1 * denom2}; // 분자, 분모
        int max = GCD(answer[0], answer[1]); // 최대공약수

        // 기약분수 구하기 (약분)
        // 기약분수 = 분모와 분자 / 최대공약수
        answer[0] /= max;
        answer[1] /= max;
        return answer;
    }
}
