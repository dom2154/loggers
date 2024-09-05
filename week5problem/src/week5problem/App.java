package week5problem;
public class App {

    public static void main(String[] args) {
        Logger asteriskLogger = new AsteriskLogger();
        Logger spacedLogger = new SpacedLogger();
       //messages asterisk
        asteriskLogger.log("Hello");
        asteriskLogger.error("This didnt work");
        // messages spaced
        spacedLogger.log("Hello");
        spacedLogger.error("This didnt work");
    }
}
// nother comment, this was being determined it couldnt run, like. lots of errors,
//but as soon as i ran it, it no longer had any problems... so no idea whats with that.
