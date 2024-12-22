class Solution {
    public int solution(int[] num_list) {
        int even = 0; // 짝수 번째 원소의 합
        int odd = 0; // 홀수 번째 원소의 합

        for (int i = 0; i < num_list.length; i++) {
            // i를 2로 나눴을 때, 나머지가 0일 경우
            if (i % 2 == 0) {
                even += num_list[i]; // 짝수
            } else {
                odd += num_list[i]; // 홀수
            }
        }

        // 짝수가 클 경우 짝수, 아닐 경우 홀수
        return even > odd ? even : odd;
    }
}
