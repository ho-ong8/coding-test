class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2]; // 가장 큰 수, 인덱스

        for (int i = 0; i < array.length; i++) {
            // array 배열의 원소가 클 경우
            if (array[i] > answer[0]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }

        return answer;
    }
}
