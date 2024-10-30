class Solution {
    public int solution(int[] num_list) {
        String even = ""; // 짝수
        String odd = ""; // 홀수

        for (int i = 0; i < num_list.length; i++) {
            // 배열의 원소를 2로 나눴을 때, 나머지가 0일 경우
            if (num_list[i] % 2 == 0) {
                // String.valueOf(): 문자열 변환
                even += String.valueOf(num_list[i]); // 짝수
            } else {
                odd += String.valueOf(num_list[i]); // 홀수
            }
        }

        // Integer.parseInt(): 정수 변환
        return Integer.parseInt(even) + Integer.parseInt(odd);
    }
}
