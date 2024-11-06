class Solution {
    public int solution(int a, int b) {
        // Integer.parseInt(): 정수 변환
        // String.valueOf(): 문자열 변환
        String ab = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        String ba = Integer.parseInt(String.valueOf(b) + String.valueOf(a));

        // a ⊕ b가 b ⊕ a 이상일 경우 a ⊕ b, 아닐 경우 b ⊕ a
        if (ab >= ba) {
            return ab;
        } else {
            return ba;
        }
    }
}
