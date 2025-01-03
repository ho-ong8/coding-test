import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        // BigInteger: 무한대 정수, 큰 정수 처리 => 문자열을 사용하여 정수 처리
        BigInteger big1 = new BigInteger(a);
        BigInteger big2 = new BigInteger(b);

        // BigInteger 사칙연산: add(), subtract(), multiply(), divide(), remainder()
        // 문자열을 사용하므로 일반 사칙연산 불가 (+, -, *, /, %)
        BigInteger sum = big1.add(big2);

        // toString(): 문자열 변환
        String answer = sum.toString();

        return answer;
    }
}
