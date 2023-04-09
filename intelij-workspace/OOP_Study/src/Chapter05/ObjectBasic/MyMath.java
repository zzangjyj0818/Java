package Chapter05.ObjectBasic;

//Method Overloading
// 다형성을 구현하는 한 가지 방법
// 함수시그니쳐 또는 메소드 시그니쳐가 같음
public class MyMath {
    int square(int i){
        return i*i;
    }
    double square(double i){
        return i*i;
    }
}
