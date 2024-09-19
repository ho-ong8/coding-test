class Solution {
    public int solution(int n) {
        int answer = 0; // 가장 큰 정수
        int fac = 1; // 팩토리얼

        // 팩토리얼보다 크거나 같을 경우
        while (n >= fac) {
            answer++;
            fac *= answer;
        }

        // - 1 하는 이유?
        // 반복문 종료 시 마지막 증갓값 1은 제외한다.
        return answer - 1;
    }
}
