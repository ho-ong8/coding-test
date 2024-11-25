class Solution {
    public int solution(String my_string, String is_suffix) {
        // endsWith(): 문자열 접미사 확인
        // 접미사일 경우 1, 아닐 경우 0
        return my_string.endsWith(is_suffix) ? 1 : 0;
    }
}
