class Logger {
    private static Logger instance;

    private Logger() {}

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}

public class Singleton {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("This is the first message.");

        Logger anotherLogger = Logger.getInstance();
        anotherLogger.log("This is the second message.");

        System.out.println(logger == anotherLogger);
    }
}
