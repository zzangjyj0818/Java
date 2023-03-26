import java.util.Arrays;
import java.util.Scanner;

public class MedianFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//크기가 5인 정수형 배열 선언 
		int [] arr = new int[5];
		
		//5개의 정수를 배열에 입력 받음 
		System.out.printf("정수입력 : ");
		for(int i = 0; i<5; i++)
			arr[i] = input.nextInt();
		
		//배열을 크기순으로 정렬함.
		Arrays.sort(arr);
		
		//배열 가운데 값을 출력함.
		System.out.println(arr[2]);

	}

}
