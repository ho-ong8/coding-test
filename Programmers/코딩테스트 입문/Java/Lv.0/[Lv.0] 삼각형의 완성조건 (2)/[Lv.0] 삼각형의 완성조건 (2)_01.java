class Solution {
    public int solution(int[] sides) {
        // 한 변이 될 수 있는 정수의 개수 = 최솟값 * 2 - 1
        int answer = Math.min(sides[0], sides[1]); // 최솟값
        return answer * 2 - 1;
    }
}
