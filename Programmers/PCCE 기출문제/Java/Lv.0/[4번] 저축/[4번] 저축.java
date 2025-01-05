import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int before = sc.nextInt();
        int after = sc.nextInt();
        int money = start;
        int month = 1;

        // 70보다 작을 경우
        while (money < 70) {
            money += before;
            month++;
        }

        // 100보다 작을 경우
        while (money < 100) {
            money += after;
            month++;
        }

        System.out.println(month);
    }
}
