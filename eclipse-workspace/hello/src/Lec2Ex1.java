import java.util.Scanner;

public class Lec2Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a,b;
		
		System.out.println("a와 b 입력 : ");
		
		a = input.nextInt();
		b = input.nextInt();
		
		if(a>b)
			System.out.println(a);
		else if(a==b)
			System.out.println("a와 b가 같습니다.");
		else
			System.out.println(b);

	}

}
