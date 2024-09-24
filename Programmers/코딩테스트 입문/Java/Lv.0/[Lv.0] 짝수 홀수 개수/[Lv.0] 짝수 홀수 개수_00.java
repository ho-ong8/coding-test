class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2]; // 짝수, 홀수의 개수

        for (int i = 0; i < num_list.length; i++) {
            // 배열의 원소를 2로 나눴을 때, 나머지가 0일 경우
            if (num_list[i] % 2 == 0) {
                answer[0]++; // 짝수
            } else {
                answer[1]++; // 홀수
            }
        }

        return answer;
    }
}
