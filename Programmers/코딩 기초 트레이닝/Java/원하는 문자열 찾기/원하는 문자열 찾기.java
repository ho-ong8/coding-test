class Solution {
    public int solution(String myString, String pat) {
        // toLowerCase(): 문자열 소문자 변환
        // contains(): 문자열 포함 여부 확인
        return myString.toLowerCase().contains(pat.toLowerCase()) ? 1 : 0;
    }
}
