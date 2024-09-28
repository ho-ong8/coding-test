class Solution {
    public String[] solution(String my_str, int n) {
        int cnt = (my_str.length() + n - 1) / n; // 배열의 원소의 개수
        String[] answer = new String[cnt];

        for (int i = 0; i < cnt; i++) {
            int start = n * i; // 시작
            int end = 0; // 마지막

            // 문자열의 길이보다 크거나 같을 경우
            if (start + n >= my_str.length()) {
                end = my_str.length();
            } else {
                end = start + n;
            }

            // substring(startIndex, endIndex): startIndex(포함)부터 endIndex(불포함)까지 범위 내 문자열 자르기
            answer[i] = my_str.substring(start, end);
        }

        return answer;
    }
}
