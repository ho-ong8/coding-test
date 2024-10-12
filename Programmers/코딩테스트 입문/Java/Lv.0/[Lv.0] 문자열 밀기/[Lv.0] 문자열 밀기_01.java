class Solution {
    public int solution(String A, String B) {
        // indexOf(): 찾는 문자열이 있을 경우 인덱스 반환, 없을 경우 -1 반환
        return (B + B).indexOf(A);

        // B + B 하는 이유?
        // 밀어야 하는 횟수 = 문자열의 인덱스
        // 문자열 오른쪽으로 이동
    }
}
