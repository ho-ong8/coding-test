import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        String age_type = sc.next();
        int answer = 0;

        // equals(): 문자열 비교
        // "Korea"일 경우
        if (age_type.equals("Korea")) {
            answer = 2030 - year + 1;
        // "Year"일 경우
        } else if (age_type.equals("Year")) {
            answer = 2030 - year;
        }

        System.out.println(answer);
    }
}
