class Solution {
    public String solution(String myString) {
        // replaceAll(regex, replacement): 문자열을 다른 문자열로 치환 (regex: 정규표현식)
        // [a-k]: a부터 k까지
        return myString.replaceAll("[a-k]", "l");
    }
}
