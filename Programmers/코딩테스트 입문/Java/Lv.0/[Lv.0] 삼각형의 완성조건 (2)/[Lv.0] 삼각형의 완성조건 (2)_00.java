class Solution {
    public int solution(int[] sides) {
        // 가장 긴 변의 길이 = 최댓값 + 최솟값
        // 한 변의 길이 = 최댓값 - 최솟값
        // 가장 긴 변의 길이 - 한 변의 길이 = 한 변의 길이
        return (Math.max(sides[0], sides[1]) + Math.min(sides[0], sides[1])) - (Math.max(sides[0], sides[1]) - Math.min(sides[0], sides[1])) - 1;
    }
}
