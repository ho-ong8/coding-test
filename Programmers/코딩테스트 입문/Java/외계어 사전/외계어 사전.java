class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;

        for (int i = 0; i < dic.length; i++) {
            int cnt = 0; // 알파벳 사용 횟수

            for (int j = 0; j < spell.length; j++) {
                // contains(): 문자열 포함 여부 확인
                if (dic[i].contains(spell[j])) {
                    cnt++;
                }

                // 알파벳 사용 횟수와 배열의 길이가 같을 경우
                if (cnt == spell.length) {
                    answer = 1;
                }
            }
        }

        return answer;
    }
}
