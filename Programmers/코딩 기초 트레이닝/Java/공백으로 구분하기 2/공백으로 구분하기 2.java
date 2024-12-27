class Solution {
    public String[] solution(String my_string) {
        // trim(): 문자열 공백 제거 (양쪽)
        // split(): 문자열 분리
        // \\s+: 1개 이상 공백 (+: 반복)
        return my_string.trim().split("\\s+");
    }
}
