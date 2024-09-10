import java.math.BigInteger;

class Solution {
    // 팩토리얼 구하기
    public BigInteger fac(int num) {
        // BigInteger: 무한대 정수, 큰 정수 처리 => 문자열을 사용하여 정수 처리
        BigInteger big = new BigInteger("1");

        for (int i = 1; i <= num; i++) {
            // String.valueOf(): 문자열 변환
            big = big.multiply(new BigInteger(String.valueOf(i)));
        }

        return big;
    }

    public BigInteger solution(int balls, int share) {
        // BigInteger 사칙연산: add(), subtract(), multiply(), divide(), remainder()
        // 문자열을 사용하므로 일반 사칙연산 불가 (+, -, *, /, %)
        // balls = n, share = m
        // 경우의 수 = n! / ((n - m)! * m!)
        return fac(balls).divide((fac(balls - share).multiply(fac(share))));
    }
}
