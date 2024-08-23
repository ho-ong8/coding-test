class Solution {
    public int solution(int slice, int n) {
        // 피자 1판 = slice조각
        // n을 slice로 나눴을 때, 나머지가 0일 경우 n / slice, 아닐 경우 n / slice + 1
        return n % slice == 0 ? n / slice : n / slice + 1;
    }
}
