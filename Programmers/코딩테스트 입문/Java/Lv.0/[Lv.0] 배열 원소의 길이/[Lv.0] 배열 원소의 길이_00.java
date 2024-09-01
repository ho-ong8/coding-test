class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];

        for (int i = 0; i < strlist.length; i++) {
            // length: 배열 길이 반환
            // length(): 문자열 길이 반환
            answer[i] = strlist[i].length();
        }

        return answer;
    }
}
