class Solution {
    public int solution(String[] strArr) {
        int answer = 0; // 가장 개수가 많은 문자열의 길이
        int[] num = new int[30]; // 문자열의 길이의 개수

        for (int i = 0; i < strArr.length; i++) {
            num[strArr[i].length() - 1]++;
        }

        for (int i = 0; i < num.length; i++) {
            // 문자열의 길이의 개수가 클 경우
            if (answer < num[i]) {
                answer = num[i];
            }
        }

        return answer;
    }
}
