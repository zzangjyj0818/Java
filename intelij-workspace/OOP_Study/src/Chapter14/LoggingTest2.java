package Chapter14;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingTest2 {
    private static final Logger logger = Logger.getLogger("kr.co.company.app");

    public static void main(String[] args) {
        logger.info("Logging is start");
        try{
            throw new Exception("고의적으로 예외를 발생시킴");
        } catch (Exception e){
            logger.log(Level.SEVERE, e.getMessage(), e);
        }
        logger.info("완료되었음");
    }
}
