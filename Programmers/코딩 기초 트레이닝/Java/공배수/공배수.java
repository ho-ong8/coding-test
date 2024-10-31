class Solution {
    public int solution(int number, int n, int m) {
        // number를 n과 m으로 나눴을 때, 나머지가 0일 경우 1, 아닐 경우 0
        return number % n == 0 && number % m == 0 ? 1 : 0;
    }
}
