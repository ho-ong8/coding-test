class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        // [a, b, c]
        // a = slicer[0], b = slicer[1], c = slicer[2]
        // n이 1일 경우 0, 아닐 경우 a
        int start = n == 1 ? 0 : slicer[0]; // 시작

        // n이 2일 경우 배열의 마지막 인덱스, 아닐 경우 b
        int end = n == 2 ? num_list.length - 1 : slicer[1]; // 마지막

        // n이 4일 경우 c, 아닐 경우 1
        int step = n == 4 ? slicer[2] : 1; // 간격
        int[] answer = new int[(end - start + step) / step];

        for (int i = start, j = 0; i <= end; i += step) {
            answer[j++] = num_list[i];
        }

        return answer;
    }
}
