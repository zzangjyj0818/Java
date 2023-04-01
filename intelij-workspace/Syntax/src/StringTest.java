import java.util.*;
public class StringTest {
    public static void main(String[] args) {

        //주소를 입력받음
        String str;
        Scanner input = new Scanner(System.in);

        //무한 루프
        while(true){
            System.out.printf("문자열을 입력하세요 : ");
            str = input.next();

            if(str.equals("quit") == true)
                break;

            //해당 문자열에 www가 있는지를 matches를 활용하여 확인함
            if(str.matches("^www\\.(.+)")){
                System.out.printf("%s는 'www'로 시작합니다.\n", str);
            }
            else {
                System.out.printf("%s는 'www'로 시작하지 않습니다.\n", str);
            }
        }

    }
}
