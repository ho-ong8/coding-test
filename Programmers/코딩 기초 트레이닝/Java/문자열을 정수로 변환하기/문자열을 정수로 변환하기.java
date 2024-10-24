class Solution {
    public int solution(String n_str) {
        // Integer.parseInt(): 정수 변환
        // 기본형 int 반환
        return Integer.parseInt(n_str);

        // Integer.valueOf(): 정수 변환
        // 참조형 new Integer() 반환 => new Integer(Integer.parseInt())
        // return Integer.valueOf(n_str);
    }
}
