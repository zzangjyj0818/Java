package 정연재202020985;

import java.io.IOException;

public class Finalterm06 {
    public class TooSmallException extends ArithmeticException {
        public TooSmallException() {
            super("First number is too small");
        }
    }

    public static void main(String[] args) {
        try {
            int case1 = Integer.parseInt("ABC");
            int case2 = 3 / 0;
            int case3 = new Finalterm06().sum(0, 2);
            int[] check = new int[1];
            int case4 = check[1];
            int case5 = System.in.read(new byte[100]);
        }  catch (TooSmallException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index 1 out of bounds for length 1");
        }catch (NumberFormatException e) {
            System.out.println("For input string: " + "ABC");
        }
    }

    public int sum(int a, int b) throws TooSmallException {
        if (a == 0)
            throw new TooSmallException();
        return a + b;
    }
}
