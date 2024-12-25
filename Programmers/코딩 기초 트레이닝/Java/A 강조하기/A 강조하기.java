class Solution {
    public String solution(String myString) {
        // toLowerCase(): 문자열 소문자 변환
        // replaceAll(regex, replacement): 문자열을 다른 문자열로 치환 (regex: 정규표현식)
        return myString.toLowerCase().replaceAll("a", "A");
    }
}
