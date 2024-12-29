class Solution {
    public int[] solution(String myString) {
        // split(): 문자열 분리
        String[] str = myString.split("x", -1);
        int[] answer = new int[str.length];

        for (int i = 0; i < str.length; i++) {
            answer[i] = str[i].length();
        }

        return answer;
    }
}
