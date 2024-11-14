class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // arr[i] = arr[queries[i][0]] = 이전 원소
        // arr[j] = arr[queries[i][1]] = 다음 원소
        for (int i = 0; i < queries.length; i++) {
            int num = arr[queries[i][0]];

            // 원소 바꾸기
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = num;
        }

        return arr;
    }
}
