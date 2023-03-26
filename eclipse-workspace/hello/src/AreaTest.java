import java.util.Scanner;

public class AreaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		//상수 선언(PI)
		final double PI = 3.141592;
		//넓이를 담을 변수 area, 반지름을 담을 r -> 실수형변수 선언 
		double area, r;
		
		//반지름을 입력받음 
		System.out.println("반지름을 입력하세요 : ");
		r = input.nextDouble();
		
		//면적을 계산함 
		area = PI*r*r;
		
		//결과값 출력 
		System.out.println("반지름이 "+r+"인 원의 면적은 "+area+"입니다.");
	}
}
