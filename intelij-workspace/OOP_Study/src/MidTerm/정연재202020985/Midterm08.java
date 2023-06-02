package 정연재202020985;

import javax.swing.Timer;

public class Midterm08 {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {1, 2}, {1}, {1, 2, 3}};
        int i = 0, j = 0;
        Timer t = new Timer(1000, event -> System.out.print(""));
        t.start();

        while (i != a.length) {
            while (j != a[i].length) {
                System.out.print(a[i][j] + " ");
                j++;
            }
            j = 0;
            i++;
            System.out.println("");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
