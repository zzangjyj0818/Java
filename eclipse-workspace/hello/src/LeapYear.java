import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int year;
		
		//연도를 입력받음 
		System.out.println("연도를 입력하세요 : ");
		year = input.nextInt();
		
		//문자열 변수 result에 삼항 연산자를 사용하여 결과값을 넣어줌 
		String result = year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? "윤년입니다." : "평년입니다.";
		
		System.out.println(result);
	}

}
