package chainOfResponsibilityPattern;

public class ChainPatternDemo {
    private static AbstractLogger getChainLoggers(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }
    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "정보");

        loggerChain.logMessage(AbstractLogger.DEBUG, "디버깅 정보");

        loggerChain.logMessage(AbstractLogger.ERROR, "에러 정보");
    }
}
