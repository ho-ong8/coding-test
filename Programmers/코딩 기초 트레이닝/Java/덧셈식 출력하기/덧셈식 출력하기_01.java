import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // printf(서식, 내용): 출력 (서식 지정, 줄 바꿈 X)
        System.out.printf("%d + %d = %d", a, b, a + b);

        // %d: 정수 (10진수)
        // %o: 정수 (8진수)
        // %x: 정수 (16진수)
        // %f: 실수
        // %e: 지수
        // %c: 문자
        // %s: 문자열
        // %n: 줄 바꿈
        // %b: boolean
    }
}
