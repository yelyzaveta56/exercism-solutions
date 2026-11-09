public class LogLevels {
    
    public static String message(String logLine) {
        String[] splitted = logLine.split(":");
        return splitted[1].trim();
    }

    public static String logLevel(String logLine) {
        String[] splitted = logLine.split(":");
        String level = splitted[0].trim();
        level = level.replace("[", "");
        level = level.replace("]", "");
        return level.toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
