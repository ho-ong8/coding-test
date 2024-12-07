class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";

        for (int i = 0; i < code.length(); i++) {
            // i를 q로 나눴을 때, 나머지가 r일 경우
            if (i % q == r) {
                // charAt(): 문자 변환
                answer += code.charAt(i);
            }
        }

        return answer;
    }
}
