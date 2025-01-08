class Solution {
    public int solution(String myString, String pat) {
        // replace(target, replacement): 문자열을 다른 문자열로 치환
        // contains(): 문자열 포함 여부 확인
        return myString.replace("A", "X").replace("B", "A").replace("X", "B").contains(pat) ? 1 : 0;
    }
}
