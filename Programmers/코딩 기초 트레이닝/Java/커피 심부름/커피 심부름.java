class Solution {
    public int solution(String[] order) {
        int answer = 0; // 결제 금액

        for (int i = 0; i < order.length; i++) {
            // contains(): 문자열 포함 여부 확인
            // "cafelatte"가 포함되어 있을 경우
            if (order[i].contains("cafelatte")) {
                answer += 5000;
            } else {
                answer += 4500;
            }
        }

        return answer;
    }
}
