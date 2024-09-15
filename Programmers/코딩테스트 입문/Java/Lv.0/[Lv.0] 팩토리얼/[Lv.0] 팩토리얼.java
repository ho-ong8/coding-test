class Solution {
    public int solution(int n) {
        int answer = 0; // 가장 큰 정수
        int fac = 1; // 팩토리얼

        // n이 팩토리얼보다 크거나 같을 경우
        while (n >= fac) {
            answer++;
            fac *= answer;
        }

        // - 1 하는 이유?
        // 입출력 예의 n이 10일 때, fac이 11이 되면 반복문을 종료한다.
        // 반복문 종료 시 증가한 값 1은 제외한다.
        return answer - 1;
    }
}
