class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};

        // replaceAll(regex, replacement): 문자열을 다른 문자열로 치환 (regex: 정규표현식)
        // [a-c]: a부터 c까지
        String s = myStr.replaceAll("[a-c]", " ");

        // trim(): 문자열 공백 제거 (양쪽)
        // isEmpty(): 문자열의 길이가 0일 경우 true 반환
        // 빈 문자열일 경우 (공백 제거)
        if (s.trim().isEmpty()) {
            answer = new String[] {"EMPTY"};
        } else {
            // split(): 문자열 분리
            // \\s+: 1개 이상 공백 (+: 반복)
            answer = s.trim().split("\\s+");
        }

        return answer;
    }
}
