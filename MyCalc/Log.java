package MyCalc;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Log {
    
    public void writeLog (String result) {
        Logger logger = Logger.getLogger("MyLog");
        FileHandler fh;
    try {
        // This block configure the logger with handler and formatter
        fh = new FileHandler("CalcLog.log");
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);
        // the following statement is used to log any messages
        logger.info(result);
    } catch (SecurityException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
        
}

