class Solution {
    public int solution(int hp) {
        // 몫 = 마리
        // 장군개미 -> 병정개미 -> 일개미
        return (hp / 5) + (hp % 5 / 3) + (hp % 5 % 3);
    }
}
