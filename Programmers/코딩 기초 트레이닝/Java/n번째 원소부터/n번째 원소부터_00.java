class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length - n + 1];
        int cnt = 0; // 인덱스

        for (int i = n; i <= num_list.length; i++) {
            answer[cnt++] = num_list[i - 1];
        }

        return answer;
    }
}
