public class ExceptionTest3 {
    public static void main(String[] args) {
        try{
            int num = getStringNum();
            System.out.println(num);
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }

    public static int getStringNum()throws NumberFormatException{
        int num = Integer.parseInt("ABC");
        return num;
    }
}
