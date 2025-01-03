class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;

        // date1[i] = 첫 번째 배열의 원소, date2[i] = 두 번째 배열의 원소
        for (int i = 0; i < date1.length; i++) {
            // 첫 번째 배열의 원소가 작을 경우
            if (date1[i] < date2[i]) {
                answer = 1;
                break;
            // 첫 번째 배열의 원소가 클 경우
            } else if (date1[i] > date2[i]) {
                answer = 0;
                break;
            }
        }

        return answer;
    }
}
