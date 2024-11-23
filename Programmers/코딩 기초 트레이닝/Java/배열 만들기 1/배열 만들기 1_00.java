class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n / k];

        for (int i = 1; i <= n / k; i++) {
            // i = 1 -> answer[0] = k * 1
            answer[i - 1] = k * i;
        }

        return answer;
    }
}
