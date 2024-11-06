class Solution {
    public int[] solution(int n, int[] numlist) {
        int cnt = 0; // 배수의 개수

        // 배수의 개수 구하기
        for (int i = 0; i < numlist.length; i++) {
            // 배열의 원소를 n으로 나눴을 때, 나머지가 0일 경우
            if (numlist[i] % n == 0) {
                cnt++;
            }
        }

        int[] answer = new int[cnt];

        cnt = 0; // 초기화

        // 배수의 배열 구하기
        for (int i = 0; i < numlist.length; i++) {
            // 배열의 원소를 n으로 나눴을 때, 나머지가 0일 경우
            if (numlist[i] % n == 0) {
                answer[cnt] = numlist[i];
                cnt++;
            }
        }

        return answer;
    }
}
