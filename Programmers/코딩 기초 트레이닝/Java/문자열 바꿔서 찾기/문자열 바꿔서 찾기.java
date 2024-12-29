class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;

        // replace(target, replacement): 문자열을 다른 문자열로 치환
        String s = myString.replace("A", "X").replace("B", "A").replace("X", "B");

        // contains(): 문자열 포함 여부 확인
        if (s.contains(pat)) {
            answer = 1;
        }

        return answer;
    }
}
