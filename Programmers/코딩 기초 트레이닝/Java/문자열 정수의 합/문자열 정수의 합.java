class Solution {
    public int solution(String num_str) {
        int answer = 0; // 자릿수의 합

        for (int i = 0; i < num_str.length(); i++) {
            // Integer.parseInt(): 정수 변환
            // substring(startIndex, endIndex): startIndex(포함)부터 endIndex(불포함)까지 범위 내 문자열 자르기
            answer += Integer.parseInt(num_str.substring(i, i + 1));
        }

        return answer;
    }
}
