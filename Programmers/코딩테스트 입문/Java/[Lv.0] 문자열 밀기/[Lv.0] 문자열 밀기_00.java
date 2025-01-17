class Solution {
    public int solution(String A, String B) {
        int answer = -1; // 밀어야 하는 횟수
        String s = A;

        for (int i = 0; i < A.length(); i++) {
            // equals(): 문자열 비교
            if (s.equals(B)) {
                answer = i;
                break;
            }

            // charAt(): 문자 변환
            // substring(startIndex, endIndex): startIndex(포함)부터 endIndex(불포함)까지 범위 내 문자열 자르기
            s = s.charAt(A.length() - 1) + s.substring(0, A.length() - 1);
        }

        return answer;
    }
}
