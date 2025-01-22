class Solution {
    public String solution(String my_string) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            // charAt(): 문자 변환
            char c = my_string.charAt(i);

            // isUpperCase(), isLowerCase(): 문자열 대소문자 여부 확인
            if (Character.isUpperCase(c)) {
                // toLowerCase(): 문자열 소문자 변환
                answer += Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                // toUpperCase(): 문자열 대문자 변환
                answer += Character.toUpperCase(c);
            }
        }

        return answer;
    }
}
