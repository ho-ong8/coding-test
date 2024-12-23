class Solution {
    public int solution(int[] num_list) {
        int answer = 0; // 나누기 연산의 횟수

        for (int i = 0; i < num_list.length; i++) {
            // 1이 아닐 경우
            while (num_list[i] != 1) {
                // 배열의 원소를 2로 나눴을 때, 나머지가 0일 경우
                if (num_list[i] % 2 == 0) {
                    num_list[i] /= 2;
                } else {
                    num_list[i] = (num_list[i] - 1) / 2;
                }

                answer++;
            }
        }

        return answer;
    }
}
