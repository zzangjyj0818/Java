import java.util.Scanner;

public class Lec3Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("양의 정수를 입력하시오 : ");
		n = input.nextInt();
		
		
		System.out.println(n + "의 약수는 다음과 같습니다.");
		for(int i = 1; i<n+1; i++) {
			if(n % i == 0)
				System.out.println(i + " ");
		}

	}

}
