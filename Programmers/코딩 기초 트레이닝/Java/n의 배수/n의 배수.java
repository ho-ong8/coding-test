class Solution {
    public int solution(int num, int n) {
        // num을 n으로 나눴을 때, 나머지가 0일 경우 1, 아닐 경우 0
        return num % n == 0 ? 1 : 0;
    }
}
