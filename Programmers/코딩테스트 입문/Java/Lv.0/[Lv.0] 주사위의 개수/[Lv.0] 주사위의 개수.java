class Solution {
    public int solution(int[] box, int n) {
        // 주사위의 모서리 길이 = n
        // 상자의 부피 = 상자의 가로 길이 * 상자의 세로 길이 * 상자의 높이 길이
        // 주사위의 개수 = (상자의 가로 길이 / n) * (상자의 세로 길이 / n) * (상자의 높이 길이 / n)
        return (box[0] / n) * (box[1] / n) * (box[2] / n);
    }
}
