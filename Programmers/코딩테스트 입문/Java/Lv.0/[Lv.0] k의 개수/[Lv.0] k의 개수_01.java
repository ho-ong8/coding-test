class Solution {
    public int solution(int i, int j, int k) {
        String answer = ""; // k의 개수

        for (int a = i; a <= j; a++) {
            // + "" 하는 이유?
            // 문자열 변환 => 문자열 + 정수 = 문자열
            answer += a + "";
        }

        // replace(target, replacement): 문자열을 다른 문자열로 치환
        return answer.length() - answer.replace(k + "", "").length();
    }
}
