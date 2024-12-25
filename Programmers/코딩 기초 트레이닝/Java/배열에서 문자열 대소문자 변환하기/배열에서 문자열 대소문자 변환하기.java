class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            // i를 2로 나눴을 때, 나머지가 0일 경우
            if (i % 2 == 0) {
                // toLowerCase(): 문자열 소문자 변환
                // 짝수 번째 인덱스
                answer[i] = strArr[i].toLowerCase();
            } else {
                // toUpperCase(): 문자열 대문자 변환
                // 홀수 번째 인덱스
                answer[i] = strArr[i].toUpperCase();
            }
        }

        return answer;
    }
}
