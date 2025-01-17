class Solution {
    public int solution(String str1, String str2) {
        // contains(): 문자열 포함 여부 확인
        // 문자열이 포함되어 있을 경우 1, 아닐 경우 2
        return str1.contains(str2) ? 1 : 2;
    }
}
