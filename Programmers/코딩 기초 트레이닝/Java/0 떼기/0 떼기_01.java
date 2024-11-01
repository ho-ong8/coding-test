class Solution {
    public String solution(String n_str) {
        // replace(target, replacement): 문자열을 다른 문자열로 치환
        // /^0+/: 1개 이상 0으로 시작 (^: 시작, +: 반복)
        return n_str.replace(/^0+/, "");
    }
}
