class Solution {
    public String solution(String myString, String pat) {
        // substring(startIndex, endIndex): startIndex(포함)부터 endIndex(불포함)까지 범위 내 문자열 자르기
        // lastIndexOf(): 문자열 마지막 부분부터 찾는 문자열이 있을 경우 인덱스 반환, 없을 경우 -1 반환
        return myString.substring(0, myString.lastIndexOf(pat)) + pat;
    }
}
