package Chapter05.String;

public class StringTest1 {
    public static void main(String[] args) {
        String proverb = "A barking dog";
        String s1, s2, s3, s4;

        System.out.println("문자열의 길이 : " + proverb.length());

        s1 = proverb.concat(" never Bites!"); //문자열 결합
        s2 = proverb.replace('B', 'b'); //문자 교환
        s3 = proverb.substring(2,5); //부분 문자열 추출
        s4 = proverb.toUpperCase();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}

// 랩퍼 클래스
// 기본 자료형을 객체로 포장하고 싶을 경우에 사용
