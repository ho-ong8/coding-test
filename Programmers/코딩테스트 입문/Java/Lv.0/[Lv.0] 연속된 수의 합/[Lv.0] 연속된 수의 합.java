class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];

        // 시작값 = total의 중간값 - num의 중간값
        int n = (total / num) - ((num - 1) / 2);

        for (int i = 0; i < num; i++) {
            answer[i] = n;
            n++;
        }

        return answer;
    }
}
