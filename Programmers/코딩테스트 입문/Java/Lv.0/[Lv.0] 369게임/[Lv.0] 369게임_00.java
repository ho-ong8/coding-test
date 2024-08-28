class Solution {
    public int solution(int order) {
        int answer = 0; // 쳐야 할 박수 횟수

        while (order != 0) {
            // order를 10으로 나눴을 때, 나머지가 3, 6, 9일 경우
            if (order % 10 == 3 || order % 10 == 6 || order % 10 == 9) {
                answer++;
            }

            // order /= 10 하는 이유?
            // order /= 10 => 10의 자릿수 -> 1의 자릿수 변환 (몫)
            order /= 10;
        }

        return answer;
    }
}
