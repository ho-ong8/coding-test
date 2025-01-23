class Solution {
    public String solution(String my_string, int n) {
        String answer = "";

        // split(): 문자열 분리
        String[] str = my_string.split("");

        for (int i = 0; i < my_string.length(); i++) {
            // repeat(): 문자열 반복
            answer += str[i].repeat(n);
        }

        return answer;
    }
}
