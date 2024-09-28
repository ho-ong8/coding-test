class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            // 배열의 원소와 n이 같을 경우
            if (array[i] == n) {
                answer++;
            }
        }

        return answer;
    }
}
