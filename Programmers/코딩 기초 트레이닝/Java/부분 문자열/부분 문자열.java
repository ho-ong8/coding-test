class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;

        // contains(): 문자열 포함 여부 확인
        if (str2.contains(str1)) {
            answer = 1;
        } else {
            answer = 0;
        }

        return answer;
    }
}
