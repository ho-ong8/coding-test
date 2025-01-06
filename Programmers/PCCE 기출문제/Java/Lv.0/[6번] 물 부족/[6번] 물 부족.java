class Solution {
    public int solution(int storage, int usage, int[] change) {
        int total_usage = 0;

        for (int i = 0; i < change.length; i++) {
            usage += usage * change[i] / 100;
            total_usage += usage;

            // 저수지에 저장된 물의 양보다 클 경우
            if (total_usage > storage) {
                return i;
            }
        }

        return -1;
    }
}
