package Chapter04;

public class RandomWalk {
    public static void main(String[] args) {
        int x = 5, y = 5;
        boolean tile[][]= new boolean[10][10];
        int steps;

        tile[5][5] = true;
        for(steps = 0; steps < 10; steps++) {
            int direction = (int) (Math.random() * 4);
            if (direction == 0 && x > 0)
                x--;
            else if (direction == 1 && x < 9)
                x++;
            else if (direction == 2 && y > 0)
                y--;
            else if (y < 9)
                y++;
            tile[y][x] = true;

            System.out.println("----------------------------------------");
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (tile[i][j] == true)
                        System.out.print("# ");
                    else
                        System.out.print(". ");
                }
                System.out.println();
            }
            System.out.println("----------------------------------------");
        }
        System.out.println("전체 이동수는 = " + steps);
    }
}
