class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail"; // 로그인 결과

        for (int i = 0; i < db.length; i++) {
            // 아이디가 일치할 경우
            if (id_pw[0].equals(db[i][0])) {
                // 비밀번호가 일치할 경우
                if (id_pw[1].equals(db[i][1])) {
                    answer = "login";
                // 비밀번호가 일치하지 않을 경우
                } else {
                    answer = "wrong pw";
                }
            }
        }

        return answer;
    }
}
