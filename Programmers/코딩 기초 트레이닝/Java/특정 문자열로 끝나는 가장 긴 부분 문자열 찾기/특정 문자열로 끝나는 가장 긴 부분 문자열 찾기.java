class Solution {
    public String solution(String myString, String pat) {
        String answer = "";

        // 문자열의 문자 역순 삽입 = i부터 0까지 감소
        // 문자열의 마지막 문자 = 문자열의 길이 - 1
        for (int i = myString.length() - 1; i >= 0; i--) {
            // substring(startIndex, endIndex): startIndex(포함)부터 endIndex(불포함)까지 범위 내 문자열 자르기
            String s = myString.substring(0, i + 1);

            // endsWith(): 문자열 접미사 확인
            if (s.endsWith(pat)) {
                answer = s;
                break;
            }
        }

        return answer;
    }
}
