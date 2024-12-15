class Solution {
    public String solution(String my_string, int[][] queries) {
        // String: 불변 문자열을 처리하기 위한 클래스 (불변, 신규 객체로 추가 및 변경)
        // 문자열 연산 시 신규 메모리 할당 및 해제 => 연산이 많을 경우 성능상 좋지 않다.

        // StringBuilder, StringBuffer: 가변 문자열을 처리하기 위한 클래스 (가변, 기존 객체에 추가 및 변경)
        // StringBuidler는 싱글스레드, StringBuffer는 멀티스레드 환경에서 유리하다.
        // 문자열 연산 시 기존 데이터 참조 => 연산 속도가 빠르고, 상대적으로 부하가 적다.
        // 사용 후 String 변환 => String.valueOf(), toString()
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < queries.length; i++) {
            // append(): 문자열 추가
            // substring(startIndex, endIndex): startIndex(포함)부터 endIndex(불포함)까지 범위 내 문자열 자르기
            sb.append(my_string.substring(queries[i][0], queries[i][1] + 1));

            // reverse(): 반전 반환
            my_string = my_string.substring(0, queries[i][0]) + sb.reverse() + my_string.substring(queries[i][1] + 1);

            // setLength(): 문자열 길이 조정
            sb.setLength(0);
        }

        return my_string;
    }
}
