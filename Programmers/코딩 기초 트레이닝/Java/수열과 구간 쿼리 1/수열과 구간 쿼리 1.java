class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // [s, e, k]
        // s = queries[j][0], e = queries[j][1], k = queries[j][2]
        for (int j = 0; j < queries.length; j++) {
            // i 구하기 (s ≤ i ≤ e)
            for (int i = queries[j][0]; i <= queries[j][1]; i++) {
                arr[i]++;
            }
        }

        return arr;
    }
}
