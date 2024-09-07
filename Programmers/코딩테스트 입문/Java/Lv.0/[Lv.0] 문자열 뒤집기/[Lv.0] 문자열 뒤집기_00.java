class Solution {
    public String solution(String my_string) {
        String answer = "";

        // 문자열의 문자 역순 삽입 = i부터 0까지 감소
        // 문자열의 마지막 문자 = 문자열의 길이 - 1
        for (int i = my_string.length() - 1; i >= 0; i--) {
            // charAt(): 문자 변환
            answer += my_string.charAt(i);
        }

        return answer;
    }
}
