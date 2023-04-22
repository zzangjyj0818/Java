package Chapter06.CallByVaule;

public class MyCounter {
    int value = 0;
    void inc(MyCounter ctr){
        ctr.value += 1;
    }
}
