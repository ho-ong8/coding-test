class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;

        // arr1 = 첫 번째 배열, arr2 = 두 번째 배열
        // 첫 번째 배열의 길이가 클 경우
        if (arr1.length > arr2.length) {
            answer = 1;
        // 두 번째 배열의 길이가 클 경우
        } else if (arr1.length < arr2.length) {
            answer = -1;
        } else {
            int sum1 = 0; // 첫 번째 배열의 합
            int sum2 = 0; // 두 번째 배열의 합

            for (int i = 0; i < arr1.length; i++) {
                sum1 += arr1[i];
                sum2 += arr2[i];

                // 첫 번째 배열의 합이 클 경우
                if (sum1 > sum2) {
                    answer = 1;
                // 두 번째 배열의 합이 클 경우
                } else if (sum1 < sum2) {
                    answer = -1;
                } else {
                    answer = 0;
                }
            }
        }

        return answer;
    }
}
