class Solution {
    public int solution(int[] arr, int idx) {
        int answer = 0; // 가장 작은 인덱스

        for (int i = 0; i < arr.length; i++) {
            // idx 이상이면서, 배열의 원소가 1일 경우
            if (i >= idx && arr[i] == 1) {
                answer = i;
                break;
            } else {
                answer = -1;
            }
        }

        return answer;
    }
}
