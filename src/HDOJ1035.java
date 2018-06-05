import java.util.Scanner;

/**
 * 练习专用类
 *
 * @author johnny
 */
public class HDOJ1035 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r;
        int c;
        int k;
        while (true) {
            r = in.nextInt();
            c = in.nextInt();
            if (r == 0 && c == 0) {
                break;
            }
            k = in.nextInt();
            int step = 0;
            int x = 0;
            int y = k - 1;

            char[][] set = new char[r][c];
            int[][] time = new int[r][c];
            for (int i = 0; i < r; i++) {
                set[i] = in.next().toCharArray();
            }

            while (true) {
                step++;
                if (set[x][y] == 'N') {
                    time[x][y] = step;
                    x--;
                } else if (set[x][y] == 'S') {
                    time[x][y] = step;
                    x++;
                } else if (set[x][y] == 'W') {
                    time[x][y] = step;
                    y--;
                } else {
                    time[x][y] = step;
                    y++;
                }

                if (x < 0 || x > r || y < 0 || y > c) {
                    System.out.printf("%d step(s) to exit\n", step);
                    break;
                }
                if (time[x][y] != 0) {
                    System.out.printf("%d step(s) before a loop of %d step(s)\n", time[x][y] - 1, step - time[x][y] + 1);
                    break;
                }
            }
        }
    }
}
