class Solution {
    public int[][] solution(int[] num_list, int n) {
        // new int[행][열]
        int[][] answer = new int[num_list.length / n][n];

        for (int i = 0; i < num_list.length; i++) {
            // i = 0 -> answer[0][0] = numbers[0]
            answer[i / n][i % n] = num_list[i];
        }

        return answer;
    }
}
