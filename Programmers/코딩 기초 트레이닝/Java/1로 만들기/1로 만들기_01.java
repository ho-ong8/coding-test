class Solution {
    public int solution(int[] num_list) {
        int answer = 0; // 나누기 연산의 횟수

        for (int i = 0; i < num_list.length; i++) {
            // 1이 아닐 경우
            while (num_list[i] != 1) {
                num_list[i] /= 2;
                answer++;
            }
        }

        return answer;
    }
}
