class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];

        // 시작값 = total의 중간값 - num의 중간값

        // (num - 1) / 2 하는 이유?
        // 입출력 예의 num이 4, total이 14일 때, result의 배열은 [2, 3, 4, 5]이다.
        // total의 중간값 = total / num = 14 / 4 = 3
        // num의 중간값 = num / 2 = 4 / 2 = 2
        // 3 - 2 = 1이므로 2가 나오려면 (num - 1) / 2 해야 한다.
        int n = (total / num) - ((num - 1) / 2);

        for (int i = 0; i < num; i++) {
            answer[i] = n;
            n++;
        }

        return answer;
    }
}
