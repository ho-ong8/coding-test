class Solution {
    public int solution(int[] array, int height) {
        int answer = 0; // 머쓱이보다 키 큰 사람 수

        for (int i = 0; i < array.length; i++) {
            // 머쓱이의 키보다 클 경우
            if (array[i] > height) {
                answer++;
            }
        }

        return answer;
    }
}
