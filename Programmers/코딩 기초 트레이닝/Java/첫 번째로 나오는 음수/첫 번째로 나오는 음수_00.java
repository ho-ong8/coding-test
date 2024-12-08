class Solution {
    public int solution(int[] num_list) {
        int answer = -1; // 음수의 인덱스

        for (int i = 0; i < num_list.length; i++) {
            // 0보다 작을 경우
            if (num_list[i] < 0) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}
