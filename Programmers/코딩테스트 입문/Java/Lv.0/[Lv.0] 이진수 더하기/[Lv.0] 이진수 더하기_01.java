class Solution {
    public String solution(String bin1, String bin2) {
        // Integer.parseInt(): 정수 변환
        // Integer.toBinaryString(): 2진수 변환
        return Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2));
    }
}
