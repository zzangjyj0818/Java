package Class;

public class SafeArray {
    private int a[];
    public int length;
    public  SafeArray(int size){
        a = new int[size];
        length = size;
    }

    public int getA(int index) {
        if(index < length)
            return a[index];
        else{
            System.out.println("Wrond Index");
            return -1;
        }
    }
    public void setA(int index, int value) {
        if(index < length && index > -1)
            this.a[index] = value;
        else
            System.out.println("Wrong Index");
    }
}
