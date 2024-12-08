class Solution {
    public String solution(String my_string, int n) {
        // substring(startIndex, endIndex): startIndex(포함)부터 endIndex(불포함)까지 범위 내 문자열 자르기
        // endIndex 생략 시 문자열 마지막까지 자르기
        return my_string.substring(my_string.length() - n);
    }
}
