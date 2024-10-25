class Solution {
    public int solution(double flo) {
        // 암시적 변환: 하위(작은) -> 상위(큰) 자료형 변환 (데이터 손실 발생 X, 자동 실행)
        // 명시적 변환: 상위(큰) -> 하위(작은) 자료형 변환 (데이터 손실 발생 O, 자료형 명시 시 실행)
        return (int) flo;
    }
}
