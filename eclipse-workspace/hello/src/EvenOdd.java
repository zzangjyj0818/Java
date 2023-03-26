import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int num;
		System.out.println("숫자를 입력하세요 : ");
		num = input.nextInt();
		
		if(num % 2 == 0)
			System.out.println("짝수입니다.\n");
		else
			System.out.println("홀수입니다.\n");
		
		System.out.println("프로그램이 종료되었습니다.\n");
	}
}