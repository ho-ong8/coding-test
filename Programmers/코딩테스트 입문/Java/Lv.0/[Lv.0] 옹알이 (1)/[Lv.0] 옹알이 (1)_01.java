class Solution {
    public int solution(String[] babbling) {
        int answer = 0; // 발음 가능한 단어의 개수

        for (int i = 0; i < babbling.length; i++) {
            // matches(regex): 문자열 포함 여부 확인 (regex: 정규표현식)
            // 배열의 원소가 정규표현식과 매치될 경우
            if (babbling[i].matches("^(aya(?!aya)|ye(?!ye)|woo(?!woo)|ma(?!ma))+$")) {
                answer++;
            }
        }

        return answer;
    }
}
