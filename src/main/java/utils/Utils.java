package utils;

public class Utils {

    public static void print(String stringToPrint){
        System.out.println(stringToPrint);
    }

    public static String getMethodName() {
        StackTraceElement stackTraceElements [] = (new Throwable()).getStackTrace();
        return stackTraceElements[1].getMethodName();
    }

}
