package beggining;

import java.io.IOException;
import java.util.logging.*;

public class LoggingExpl {

    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws Exception{

        //Logger logger = Logger.getLogger(LoggingExpl.class.getName());
        //FileHandler fileHandler = null;
        //System.out.println(System.getProperty("java.util.logging.file"));
        Handler consoleHandler = new ConsoleHandler();
        consoleHandler.setFilter(new MyFilter());
        consoleHandler.setFormatter (new MyFormatter());
        /*try {
            fileHandler = new FileHandler("MyLogFile.log");
            logger.addHandler(fileHandler);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);

        }catch (SecurityException e) {
            logger.log(Level.SEVERE,
                    "не удалось из-за безопасности",
                    e);
        }catch (IOException e){
            logger.log(Level.SEVERE,
                    "ввод-вывод",
                    e);
        }*/

        logger.setUseParentHandlers(false);
        logger.addHandler(consoleHandler);
        logger.severe("severe max");
        logger.info("info");
        logger.info("info max");
        logger.info("infomax");

    }
    static class MyFilter implements Filter{

        @Override
        public boolean isLoggable(LogRecord record) {
            return record.getMessage().endsWith(" max");
        }
    }
    static class MyFormatter extends Formatter{

        @Override
        public String format(LogRecord record) {
            return record.getLevel() + record.getMessage();
        }
    }
}
