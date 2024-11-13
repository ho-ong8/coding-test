class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        int num1 = num_list[num_list.length - 1]; // 배열의 마지막 원소
        int num2 = num_list[num_list.length - 2]; // 배열의 마지막 이전 원소

        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }

        // 배열의 마지막 원소가 클 경우 num1 - num2, 아닐 경우 num1 * 2
        if (num1 > num2) {
            answer[num_list.length] = num1 - num2;
        } else {
            answer[num_list.length] = num1 * 2;
        }

        return answer;
    }
}
