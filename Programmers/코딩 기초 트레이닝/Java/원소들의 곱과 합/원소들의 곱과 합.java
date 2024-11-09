class Solution {
    public int solution(int[] num_list) {
        int sum = 0; // 합
        int mul = 1; // 곱

        for (int i = 0; i < num_list.length; i++) {
            sum += num_list[i]; // 합
            mul *= num_list[i]; // 곱
        }

        // 합의 제곱이 클 경우 1, 아닐 경우 0
        return sum * sum > mul ? 1 : 0;
    }
}
