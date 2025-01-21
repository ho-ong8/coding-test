class Solution {
    public int solution(int[] numbers, int k) {
        // - 1 하는 이유?
        // 처음 공을 던지는 1번은 제외한다.
        return numbers[(k - 1) * 2 % numbers.length];
    }
}
