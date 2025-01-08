class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0; // true인 항만 더한 값

        // 등차수열 구하기
        for (int i = 0; i < included.length; i++) {
            // true일 경우
            if (included[i]) {
                answer += a + (d * i);
            }
        }

        return answer;
    }
}
