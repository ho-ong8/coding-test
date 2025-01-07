import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        // String.valueOf(): 문자열 변환
        // BigInteger: 무한대 정수, 큰 정수 처리 => 문자열을 사용하여 정수 처리
        // BigInteger 사칙연산: add(), subtract(), multiply(), divide(), remainder()
        // 문자열을 사용하므로 일반 사칙연산 불가 (+, -, *, /, %)
        return String.valueOf(new BigInteger(a).add(new BigInteger(b)));
    }
}
