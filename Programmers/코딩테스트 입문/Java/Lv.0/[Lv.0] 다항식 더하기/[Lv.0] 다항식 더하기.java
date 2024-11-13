class Solution {
    public String solution(String polynomial) {
        String answer = ""; // 동류항끼리 더한 결괏값

        // split(): 문자열 분리
        String[] str = polynomial.split(" ");

        int x = 0; // 일차항
        int num = 0; // 상수항

        for (int i = 0; i < str.length; i++) {
            // contains(): 문자열 포함 여부 확인
            // "x"가 포함되어 있을 경우
            if (str[i].contains("x")) {
                // equals(): 문자열 비교
                // "x"일 경우
                if (str[i].equals("x")) {
                    x += 1;
                } else {
                    // Integer.parseInt(): 정수 변환
                    // replaceAll(regex, replacement): 문자열을 다른 문자열로 치환 (regex: 정규표현식)
                    x += Integer.parseInt(str[i].replaceAll("x", ""));
                }
            // "+"가 아닐 경우
            } else if (!str[i].equals("+")) {
                num += Integer.parseInt(str[i]);
            }
        }

        // 일차항과 상수항이 0이 아닐 경우
        if (x != 0 && num != 0) {
            // 일차항이 1일 경우 "x + " + num, 아닐 경우 x + "x + " + num
            answer = x == 1 ? "x + " + num : x + "x + " + num;
        // 일차항이 0이 아닐 경우 (상수항 0)
        } else if (x != 0 && num == 0) {
            // 일차항이 1일 경우 "x", 아닐 경우 x + "x"
            answer = x == 1 ? "x" : x + "x";
        // 상수항이 0이 아닐 경우 (일차항 0)
        } else if (x == 0 && num != 0) {
            // String.valueOf(): 문자열 변환
            answer = String.valueOf(num);
        }

        return answer;
    }
}
