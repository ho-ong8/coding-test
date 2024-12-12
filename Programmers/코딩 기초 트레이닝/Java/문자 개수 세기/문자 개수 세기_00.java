class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52]; // 알파벳 대소문자 개수

        for (int i = 0; i < my_string.length(); i++) {
            // charAt(): 문자 변환
            char c = my_string.charAt(i);

            // 'A' 이상이면서, 'Z' 이하일 경우
            if (c >= 'A' && c <= 'Z') {
                answer[c - 'A']++;
            // 'a' 이상이면서, 'z' 이하일 경우
            } else if (c >= 'a' && c <= 'z') {
                // + 26 하는 이유?
                // 인덱스 26부터 시작
                answer[c - 'a' + 26]++;
            }
        }

        return answer;
    }
}
