class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            // 배열의 길이가 홀수이면서, 인덱스가 짝수일 경우
            if (arr.length % 2 == 1 && i % 2 == 0) {
                answer[i] = arr[i] + n;
            // 배열의 길이가 짝수이면서, 인덱스가 홀수일 경우
            } else if (arr.length % 2 == 0 && i % 2 == 1) {
                answer[i] = arr[i] + n;
            } else {
                answer[i] = arr[i];
            }
        }

        return answer;
    }
}
