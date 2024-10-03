class Solution {
    public int solution(int a, int b) {
        // b를 2, 5로 나눴을 때, 나머지가 0일 경우
        while (b % 2 == 0 || b % 5 == 0) {
            if (b % 2 == 0) {
                b /= 2;
            }

            if (b % 5 == 0) {
                b /= 5;
            }
        }

        // a를 b로 나눴을 때, 나머지가 0일 경우 1, 아닐 경우 2
        return a % b == 0 ? 1 : 2;
    }
}
