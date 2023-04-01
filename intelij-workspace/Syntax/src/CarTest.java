import java.util.*;
public class CarTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //인스턴스 생성
        Car myCar = new Car();

        // 메뉴, 기어, 플래그를 담을 정수형 변수 선언
        int menu,gear, flag = 0;

        // 차량의 색상을 입력받음
        System.out.printf("차량의 색상은 ? ");
        myCar.color = input.next();

        //무한루프
        while(true){
            //menu를 입력받아 스위치문에서 번호에 맞는 동작을 실행하게 됨.
            System.out.printf("해당 차량에 실행할 동작은 ? (1. 기어변속 / 2. 감속 / 3. 가속 / 4.종료) ");
            menu = input.nextInt();
            switch(menu){
                case 1:
                    System.out.printf("기어 변속 ? ");
                    myCar.changeGear(gear = input.nextInt());
                    break;
                case 2:
                    System.out.printf("감속 실행\n");
                    myCar.speedDown();;
                    break;
                case 3:
                    System.out.printf("가속 실행\n");
                    myCar.speedUp();
                    break;
                case 4:
                    System.out.println(myCar);
                    flag = 1;
                    break;
                default:
                    System.out.println("유효하지 않은 메뉴");
                    break;
            }
            //switch문에서 case 4:에서 flag=1로 종료를 표시 해줌
            if(flag == 1)
                break;
        }
    }
}
