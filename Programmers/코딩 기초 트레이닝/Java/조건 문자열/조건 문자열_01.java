class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        // equals(): 문자열 비교
        // n >= m, n <= m, n > m, n < m일 경우 true, 아닐 경우 false
        // true일 경우 1, 아닐 경우 0
        return (">".equals(ineq) ? n > m : n < m) || ("=".equals(eq) ? n == m : false) ? 1 : 0;
    }
}
