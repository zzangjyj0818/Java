package Chapter03.For;

public class ContinueTest {
    public static void main(String[] args) {
        int n = 0;
        String s = "no news is good news";
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) != 'n')
                continue;
            n++;
        }
        System.out.println("문장에서 발견된 n의 개수 : "  + n);
    }
}
