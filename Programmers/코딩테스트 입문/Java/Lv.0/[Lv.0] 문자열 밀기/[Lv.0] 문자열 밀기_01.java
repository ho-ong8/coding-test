class Solution {
    public int solution(String A, String B) {
        // indexOf(): 찾는 문자열이 있을 경우 인덱스 반환, 없을 경우 -1 반환
        return (B + B).indexOf(A);
    }
}
