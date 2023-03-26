import java.util.Scanner;

public class Int2Hwd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int a;
		System.out.println("정수 입력 : ");
		a = input.nextInt();
		
		switch(a){
		case 1:
			System.out.println("하나 ");
			break;
		case 2:
			System.out.println("둘 ");
			break;
		case 3:
			System.out.println("셋 ");
			break;
		default:
			System.out.println("지원하지 않는 숫자입니다. ");
			break;
		}
	}

}
