package Chapter14;

import java.util.logging.Logger;

public class LoggingTest1 {
    public static void main(String[] args) {
        String filename = "test.dat";
        Logger.getGlobal().info(filename + " 파일을 오픈하였음");
    }
}
