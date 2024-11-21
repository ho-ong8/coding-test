class Solution {
    public int[] solution(int start_num, int end_num) {
        // + 1 하는 이유?
        // 입출력 예의 start_num이 10, end_num이 3일 때, result의 배열의 길이는 8이다.
        // 10 - 3 = 7이므로 8이 나오려면 + 1 해야 한다.
        int[] answer = new int[start_num - end_num + 1];

        // 카운트 감소
        for (int i = 0; i < answer.length; i++) {
            answer[i] = start_num--;
        }

        return answer;
    }
}
