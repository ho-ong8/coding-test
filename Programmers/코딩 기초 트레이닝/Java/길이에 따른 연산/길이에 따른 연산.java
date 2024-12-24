class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0; // 합
        int mul = 1; // 곱

        for (int i = 0; i < num_list.length; i++) {
            // 11 이상일 경우
            if (num_list.length >= 11) {
                sum += num_list[i];
                answer = sum; // 합
            } else {
                mul *= num_list[i];
                answer = mul; // 곱
            }
        }

        return answer;
    }
}
