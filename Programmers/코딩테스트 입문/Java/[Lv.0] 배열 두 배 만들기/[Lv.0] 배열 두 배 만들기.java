class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        // 두 배 증가
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }

        return answer;
    }
}
