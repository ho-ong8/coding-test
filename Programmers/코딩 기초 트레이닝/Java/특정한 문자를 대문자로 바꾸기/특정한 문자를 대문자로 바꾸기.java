class Solution {
    public String solution(String my_string, String alp) {
        // replace(target, replacement): 문자열을 다른 문자열로 치환
        // toUpperCase(): 문자열 대문자 변환
        return my_string.replace(alp, alp.toUpperCase());
    }
}
