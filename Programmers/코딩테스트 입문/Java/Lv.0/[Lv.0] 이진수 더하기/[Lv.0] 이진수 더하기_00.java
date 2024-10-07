class Solution {
    public String solution(String bin1, String bin2) {
        // Integer.parseInt(): 정수 변환
        // Integer.toBinaryString(): 2진수 변환
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);
        return Integer.toBinaryString(num1 + num2);
    }
}
