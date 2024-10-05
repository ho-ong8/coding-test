class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0; // k의 개수

        for (int a = i; a <= j; a++) {
            // String.valueOf(): 문자열 변환
            String s1 = String.valueOf(a);
            String s2 = String.valueOf(k);

            // split(): 문자열 분리
            String[] str = s1.split("");

            // contains(): 문자열 포함 여부 확인
            if (s1.contains(s2)) {
                for (int b = 0; b < str.length; b++) {
                    // equals(): 문자열 비교
                    if (str[b].equals(s2)) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}
