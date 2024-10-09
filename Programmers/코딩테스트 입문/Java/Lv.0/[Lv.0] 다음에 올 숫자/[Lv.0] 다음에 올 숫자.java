class Solution {
    public int solution(int[] common) {
        // 배열의 원소의 공차가 같을 경우
        if (common[1] - common[0] == common[2] - common[1]) {
            // 등차수열
            return common[common.length - 1] + common[1] - common[0];
        } else {
            // 등비수열
            return common[common.length - 1] * common[1] / common[0];
        }
    }
}
