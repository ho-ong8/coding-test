class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;

        for (int i = 0; i < num_list.length; i++) {
            // 배열의 원소와 n이 같을 경우
            if (num_list[i] == n) {
                answer = 1;
            }
        }

        return answer;
    }
}
