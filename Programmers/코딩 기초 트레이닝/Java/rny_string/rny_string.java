class Solution {
    public String solution(String rny_string) {
        // replaceAll(regex, replacement): 문자열을 다른 문자열로 치환 (regex: 정규표현식)
        return rny_string.replaceAll("m", "rn");
    }
}
