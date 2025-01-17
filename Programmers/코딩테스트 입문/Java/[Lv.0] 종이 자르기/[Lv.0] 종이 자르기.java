class Solution {
    public int solution(int M, int N) {
        // - 1 하는 이유?
        // 종이의 크기 = M * N
        // 종이를 가로로 자를 경우 = (M - 1) + (M * (N - 1))
        // 종이를 세로로 자를 경우 = (N - 1) + (N * (M - 1))
        return M * N - 1;
    }
}
