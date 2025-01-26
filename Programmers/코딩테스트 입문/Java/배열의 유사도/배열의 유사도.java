class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0; // 같은 원소의 개수

        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                // equals(): 문자열 비교
                if (s1[i].equals(s2[j])) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
