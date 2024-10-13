class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 기약분수: 분모와 분자의 공약수가 1뿐인 분수
        // 최대공약수: 두 개 이상의 공약수 중 최대인 공약수
        // 분수 계산 => 통분, 약분 (최대공약수 필요)
        int[] answer = new int[2]; // 분자, 분모
        int max = 1; // 최대공약수

        // 분자와 분모 구하기 (통분)
        // 분자 = 분자1 * 분모2 + 분자2 * 분모1
        // 분모 = 분모1 * 분모2
        answer[0] = numer1 * denom2 + numer2 * denom1;
        answer[1] = denom1 * denom2;

        // 최대공약수 구하기
        for (int i = 1; i <= answer[1]; i++) {
            // 분자와 분모를 i로 나눴을 때, 나머지가 0일 경우
            if (answer[0] % i == 0 && answer[1] % i == 0) {
                max = i;
            }
        }

        // 기약분수 구하기 (약분)
        // 기약분수 = 분모와 분자 / 최대공약수
        answer[0] /= max;
        answer[1] /= max;

        return answer;
    }
}
