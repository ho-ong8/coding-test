import java.time.LocalDate;

class Solution {
    public int solution(int[] date1, int[] date2) {
        // LocalDate: 날짜 출력 및 처리
        // LocalDate.of(): 지정한 날짜 생성
        LocalDate dateA = LocalDate.of(date1[0], date1[1], date1[2]);
        LocalDate dateB = LocalDate.of(date2[0], date2[1], date2[2]);

        // isBefore(): 과거일 경우 true 반환
        // dateA가 dateB보다 과거일 경우 1, 아닐 경우 0
        return dateA.isBefore(dateB) ? 1 : 0;
    }
}
