class Solution {
    public int solution(String my_string, String target) {
        int answer = 0;

        // contains(): 문자열 포함 여부 확인
        if (my_string.contains(target)) {
            answer = 1;
        }

        return answer;
    }
}
