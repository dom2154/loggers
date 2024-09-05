package week5problem;


public class AsteriskLogger implements Logger  {

    @Override
    public void log(String message) {
        System.out.println("***" + message + "***");
    }

    @Override
    public void error(String message) {
        String errorMessage = "***Error: " + message + "***";
        String asterisks = "*".repeat(errorMessage.length());

        System.out.println(asterisks);
        System.out.println(errorMessage);
        System.out.println(asterisks);
    }
}

