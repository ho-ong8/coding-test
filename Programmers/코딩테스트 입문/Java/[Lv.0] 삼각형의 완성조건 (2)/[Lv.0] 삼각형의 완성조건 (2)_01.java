class Solution {
    public int solution(int[] sides) {
        // Math.min(): 최솟값 반환
        int answer = Math.min(sides[0], sides[1]); // 가장 짧은 변의 길이

        // 한 변이 될 수 있는 정수의 개수 = 가장 짧은 변의 길이 * 2 - 1
        return answer * 2 - 1;
    }
}
