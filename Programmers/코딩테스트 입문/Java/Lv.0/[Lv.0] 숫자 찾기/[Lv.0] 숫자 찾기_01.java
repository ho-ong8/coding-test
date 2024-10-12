class Solution {
    public int solution(int num, int k) {
        // indexOf(): 찾는 문자열이 있을 경우 인덱스 반환, 없을 경우 -1 반환
        // String.valueOf(): 문자열 변환
        return ("-" + num).indexOf(String.valueOf(k));

        // "-" + num 하는 이유?
        // num 인덱스 1부터 시작
        // 문자열 변환 => 문자열 + 정수 = 문자열
    }
}
