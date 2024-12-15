class Solution {
    public String solution(String my_string, int[][] queries) {
        // toCharArray(): 문자 배열 변환
        char[] chr = my_string.toCharArray();

        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0]; // 시작
            int end = queries[i][1]; // 마지막

            for (int j = start; j <= (start + end) / 2; j++) {
                char c = chr[j];

                chr[j] = chr[start + end - j];
                chr[start + end - j] = c;
            }
        }

        return new String(chr);
    }
}
