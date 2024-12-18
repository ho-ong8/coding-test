class Solution {
    public int[] solution(int[] num_list, int n) {
        int cnt = 0; // 원소의 개수

        // 배열의 길이를 n으로 나눴을 때, 나머지가 0일 경우
        if (num_list.length % n == 0) {
            cnt = num_list.length / n;
        } else {
            cnt = num_list.length / n + 1;
        }

        int[] answer = new int[cnt];

        cnt = 0; // 초기화

        for (int i = 0; i < num_list.length; i += n) {
            answer[cnt++] = num_list[i];
        }

        return answer;
    }
}
