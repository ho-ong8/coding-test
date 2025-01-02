import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0; // 점수
        int[] num = {a, b, c, d}; // 주사위 숫자

        Arrays.sort(num); // 오름차순 정렬

        // 네 숫자가 모두 같을 경우
        if (num[0] == num[3]) {
            // 1111 x p
            answer = 1111 * num[3];
        // 세 숫자가 같고, 나머지 숫자가 다를 경우
        } else if (num[0] == num[2] || num[1] == num[3]) {
            // Math.pow(): 거듭제곱 반환
            // (10 x p + q)²
            answer = (int) Math.pow(num[1] * 10 + (num[0] + num[3] - num[1]), 2);
        // 두 숫자가 같고, 나머지 숫자가 같을 경우
        } else if (num[0] == num[1] && num[2] == num[3]) {
            // (p + q) x |p - q|
            answer = (num[0] + num[3]) * (num[3] - num[0]);
        // 두 숫자가 같고, 나머지 숫자가 다를 경우
        } else if (num[0] == num[1]) {
            // q x r
            answer = num[2] * num[3];
        // 두 숫자가 같고, 나머지 숫자가 다를 경우
        } else if (num[1] == num[2]) {
            // q x r
            answer = num[0] * num[3];
        // 두 숫자가 같고, 나머지 숫자가 다를 경우
        } else if (num[2] == num[3]) {
            // q x r
            answer = num[0] * num[1];
        // 네 숫자가 모두 다를 경우
        } else {
            answer = num[0];
        }

        return answer;
    }
}
