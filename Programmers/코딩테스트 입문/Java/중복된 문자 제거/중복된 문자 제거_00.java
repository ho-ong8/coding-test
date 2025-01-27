class Solution {
    public String solution(String my_string) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            // contains(): 문자열 포함 여부 확인
            // String.valueOf(): 문자열 변환
            // charAt(): 문자 변환
            if (!answer.contains(String.valueOf(my_string.charAt(i)))) {
                answer += my_string.charAt(i);
            }
        }

        return answer;
    }
}
