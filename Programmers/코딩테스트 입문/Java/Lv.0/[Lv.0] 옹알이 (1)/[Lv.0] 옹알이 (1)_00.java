class Solution {
    public int solution(String[] babbling) {
        int answer = 0; // 발음 가능한 단어의 개수
        String[] str = {"aya", "ye", "woo", "ma"}; // 발음 가능한 단어

        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < str.length; j++) {
                // replace(target, replacement): 문자열을 다른 문자열로 치환
                babbling[i] = babbling[i].replace(str[j], " ");
            }

            // trim(): 문자열 공백 제거 (양쪽)
            // 문자열의 길이가 0일 경우 (공백 제거)
            if (babbling[i].trim().length() == 0) {
                answer++;
            }
        }

        return answer;
    }
}
