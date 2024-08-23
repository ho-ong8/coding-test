class Solution {
    public int solution(int slice, int n) {
        // 피자 1판 = slice조각
        // 최대 나머지 값 = 나눌 값 - 1
        return (n + slice - 1) / slice;
    }
}
