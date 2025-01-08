class Solution {
    public int solution(int[] num_list) {
        // 11 이상일 경우 0, 아닐 경우 1
        int answer = num_list.length >= 11 ? 0 : 1;

        for (int i = 0; i < num_list.length; i++) {
            // 11 이상일 경우
            if (num_list.length >= 11) {
                answer += num_list[i]; // 합
            } else {
                answer *= num_list[i]; // 곱
            }
        }

        return answer;
    }
}
