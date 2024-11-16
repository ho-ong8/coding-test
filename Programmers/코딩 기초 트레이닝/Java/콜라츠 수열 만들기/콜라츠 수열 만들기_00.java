class Solution {
    public int[] solution(int n) {
        // n + " " 하는 이유?
        // 문자열 변환 => 정수 + 문자열 = 문자열
        String s = n + " "; // 콜라츠 수열

        // 1이 아닐 경우
        while (n != 1) {
            // n을 2로 나눴을 때, 나머지가 0일 경우 짝수, 아닐 경우 홀수
            // 짝수일 경우 n / 2, 홀수일 경우 n * 3 + 1
            n = n % 2 == 0 ? n / 2 : n * 3 + 1;
            s += n + " ";
        }

        // split(): 문자열 분리
        String[] str = s.split(" ");
        int[] answer = new int[str.length];

        for (int i = 0; i < answer.length; i++) {
            // Integer.parseInt(): 정수 변환
            answer[i] = Integer.parseInt(str[i]);
        }

        return answer;
    }
}
