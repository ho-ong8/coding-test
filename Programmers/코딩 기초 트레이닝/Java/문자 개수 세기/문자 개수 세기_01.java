class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52]; // 알파벳 대소문자 개수

        // toCharArray(): 문자 배열 변환
        for (char c: my_string.toCharArray()) {
            // isUpperCase(), isLowerCase(): 문자열 대소문자 여부 확인
            answer[c - 'A' - (Character.isLowerCase(c) ? 6 : 0)]++;
        }

        return answer;
    }
}
