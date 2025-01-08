class Solution {
    public int solution(String myString, String pat) {
        int answer = 0; // 등장하는 횟수

        for (int i = 0; i < myString.length(); i++) {
            // substring(startIndex, endIndex): startIndex(포함)부터 endIndex(불포함)까지 범위 내 문자열 자르기
            // startsWith(): 문자열 접두사 확인
            if (myString.substring(i).startsWith(pat)) {
                answer++;
            }
        }

        return answer;
    }
}
