class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // [s, e, k]
        // s = queries[j][0], e = queries[j][1], k = queries[j][2]
        for (int j = 0; j < queries.length; j++) {
            // i 구하기 (s ≤ i ≤ e)
            for (int i = queries[j][0]; i <= queries[j][1]; i++) {
                // i = k의 배수
                // i를 k로 나눴을 때, 나머지가 0일 경우
                if (i % queries[j][2] == 0) {
                    arr[i]++;
                }
            }
        }

        return arr;
    }
}
