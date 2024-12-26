class Solution {
    public int solution(int[] arr) {
        int answer = 0; // x 중 가장 작은 값
        boolean bool = true; // 반복 여부

        // true일 경우
        while (bool) {
            answer++;
            bool = false;

            for (int i = 0; i < arr.length; i++) {
                // 50보다 크거나 같은 짝수일 경우
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                    bool = true;
                // 50보다 작은 홀수일 경우
                } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                    arr[i] = arr[i] * 2 + 1;
                    bool = true;
                }
            }
        }

        // - 1 하는 이유?
        // arr(x) = arr(x + 1)인 x가 항상 존재한다.
        // x 중 가장 작은 값이 나오려면 - 1 해야 한다.
        return answer - 1;
    }
}
