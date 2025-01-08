class Solution {
    public int[][] solution(int[][] arr) {
        // Math.max(): 최댓값 반환
        int max = Math.max(arr.length, arr[0].length); // 최댓값
        int[][] answer = new int[max][max];

        for (int i = 0; i < arr.length; i++) {
            // arraycopy(array1, startIndex1, array2, startIndex2, length): array2 배열 startIndex2에 array1 배열 startIndex1부터 지정한 길이만큼 범위 내 배열 복사
            System.arraycopy(arr[i], 0, answer[i], 0, arr[0].length);
        }

        return answer;
    }
}
