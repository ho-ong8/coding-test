class Solution {
    public int solution(String my_string) {
        int answer = 0; // 자연수의 합

        // replaceAll(regex, replacement): 문자열을 다른 문자열로 치환 (regex: 정규표현식)
        // [a-z|A-Z]: a부터 z까지, A부터 Z까지 (or)
        String s = my_string.replaceAll("[a-z|A-Z]", "");

        // [^0-9]: 0부터 9까지 제외
        // String s = my_string.replaceAll("[^0-9]", "");

        // split(): 문자열 분리
        String[] str = s.split("");

        for (int i = 0; i < str.length; i++) {
            // Integer.parseInt(): 정수 변환
            answer += Integer.parseInt(str[i]);
        }

        return answer;
    }
}
