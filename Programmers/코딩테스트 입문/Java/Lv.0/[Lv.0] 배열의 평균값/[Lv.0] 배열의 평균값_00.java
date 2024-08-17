class Solution {
    public double solution(int[] numbers) {
        double answer = 0; // 배열의 원소의 합

        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
        }

        // 평균값 = 배열의 원소의 합 / 배열의 원소의 개수
        return answer / numbers.length;
    }
}
