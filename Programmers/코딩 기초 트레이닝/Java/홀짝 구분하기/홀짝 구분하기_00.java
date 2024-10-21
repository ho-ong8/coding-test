import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // n을 2로 나눴을 때, 나머지가 0일 경우
        if (n % 2 == 0) {
            System.out.println(n + " is even"); // 짝수
        } else {
            System.out.println(n + " is odd"); // 홀수
        }
    }
}
