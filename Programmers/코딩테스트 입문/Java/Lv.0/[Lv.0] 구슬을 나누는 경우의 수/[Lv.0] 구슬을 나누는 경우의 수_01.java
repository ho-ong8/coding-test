class Solution {
    // 팩토리얼 구하기
    public int fac(int balls, int share) {
        // 구슬을 모두 고르는 경우, 구슬을 고르지 않은 경우
        if (balls == share || share == 0) {
            return 1;
        }

        // balls = n, share = m
        // 경우의 수 = ₙCₘ = ₙ₋₁Cₘ + ₙ₋₁Cₘ₋₁
        return fac(balls - 1, share) + fac(balls - 1, share - 1);
    }

    public int solution(int balls, int share) {
        return fac(balls, share);
    }
}
