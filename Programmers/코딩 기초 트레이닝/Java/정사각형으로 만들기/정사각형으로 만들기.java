class Solution {
    public int[][] solution(int[][] arr) {
        // Math.max(): 최댓값 반환
        int max = Math.max(arr.length, arr[0].length); // 최댓값
        int[][] answer = new int[max][max];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                answer[i][j] = arr[i][j];
            }
        }

        return answer;
    }
}
