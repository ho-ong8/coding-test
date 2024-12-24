class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;

        // toLowerCase(): 문자열 소문자 변환
        // contains(): 문자열 포함 여부 확인
        if (myString.toLowerCase().contains(pat.toLowerCase())) {
            answer = 1;
        }

        return answer;
    }
}
