class Solution {
    public int solution(int chicken) {
        int answer = 0; // 서비스 치킨의 수

        // 10 이상일 경우
        while (chicken >= 10) {
            // 쿠폰 = chicken / 10
            // 남은 쿠폰 = (chicken / 10) + (chicken % 10)
            answer += chicken / 10;
            chicken = (chicken / 10) + (chicken % 10);
        }

        return answer;
    }
}
