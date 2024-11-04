class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        // 기본 문자열 + 겹쳐 쓸 문자열 + 나머지 문자열 (my_string + overwrite_string + my_string)
        // substring(startIndex, endIndex): startIndex(포함)부터 endIndex(불포함)까지 범위 내 문자열 자르기
        return my_string.substring(0, s) + overwrite_string + my_string.substring(s + overwrite_string.length());
    }
}
