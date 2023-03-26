import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String str, compare;
		
		while(true) {
			
			System.out.printf("문자열을 입력하세요> ");
			str = input.next();
			
			compare = str.substring(0,2);
			
			if(str.equals("quit"))
				break;
			
			if(compare == "www")
				System.out.printf("%s는 'www'로 시작합니다.\n", str);
			else
				System.out.printf("%s는 'www'로 시작하지 않습니다.\n", str);
		}
		
		System.out.printf("프로그램을 종료합니다.\n");
	}

}
