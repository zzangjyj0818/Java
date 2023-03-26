import java.util.Scanner;

public class MultipleOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int n;
		//입력 받을 정수 선언
		
		//숫자를 입력받음 
		System.out.printf("입력할 수 : ");
		n = input.nextInt();
		
		//n을 3으로 나머지 연산 했을때 
		//나머지가 0 이라면 3의 배수임 
		if(n%3==0)
			System.out.printf("3의 배수임 ");
		else
			System.out.printf("3의 배수가 아님 ");

	}

}
