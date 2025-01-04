class Solution {
    public int solution(int[][] arr) {
        int answer = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                // 배열의 원소가 다를 경우
                if (arr[i][j] != arr[j][i]) {
                    answer = 0;
                }
            }
        }

        return answer;
    }
}
