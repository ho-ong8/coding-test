class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        // + 1 하는 이유?
        // 입출력 예의 num1이 1, num2가 3일 때, result의 배열의 길이는 3이다.
        // 3 - 1 = 2이므로 3이 나오려면 + 1 해야 한다.
        int[] answer = new int[num2 - num1 + 1];

        for (int i = num1; i <= num2; i++) {
            // i = 1 -> answer[0] = numbers[1]
            answer[i - num1] = numbers[i];
        }

        return answer;
    }
}
