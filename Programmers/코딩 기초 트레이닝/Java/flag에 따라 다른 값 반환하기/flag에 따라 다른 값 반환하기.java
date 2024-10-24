class Solution {
    public int solution(int a, int b, boolean flag) {
        // true일 경우 a + b, 아닐 경우 a - b
        return flag ? a + b : a - b;
    }
}
