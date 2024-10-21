import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // n을 2로 나눴을 때, 나머지가 0일 경우 짝수, 아닐 경우 홀수
        System.out.println(n + " is " + (n % 2 == 0 ? "even" : "odd"));
    }
}
