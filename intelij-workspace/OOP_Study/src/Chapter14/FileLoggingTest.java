package Chapter14;

import java.io.IOException;
import java.util.logging.*;

public class FileLoggingTest {
    private static final Logger logger = Logger.getLogger(FileLoggingTest.class.getName());

    public static void main(String[] args) throws IOException {
        Handler handler = new FileHandler("logging.txt");

        logger.addHandler(handler);
        logger.setLevel(Level.FINEST);
        logger.info("info level message");
        logger.fine("fine level message");
        logger.finest("finest level message");

        handler.flush();
        handler.close();
    }
}
