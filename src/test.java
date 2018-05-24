import java.util.Scanner;

/**
 * 练习专用类
 */
public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int[] cash = {50, 20, 10, 5, 1};
        int sum = number;
        int k = 0;
        while (sum != 0) {
            if (sum >= cash[k]) {
                sum = sum - cash[k];
                System.out.println(cash[k]);
                continue;
            } else {
                k++;
                continue;
            }
        }
    }
}
