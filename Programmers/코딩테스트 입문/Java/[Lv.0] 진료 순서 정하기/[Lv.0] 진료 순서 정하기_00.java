class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length]; // 진료 순서

        // emergency[i] = 이전 원소, emergency[j] = 다음 원소
        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                // 이전 원소가 클 경우
                if (emergency[i] > emergency[j]) {
                    answer[j]++; // 다음 원소 응급도
                }
            }

            answer[i]++; // 이전 원소 응급도
        }

        return answer;
    }
}
