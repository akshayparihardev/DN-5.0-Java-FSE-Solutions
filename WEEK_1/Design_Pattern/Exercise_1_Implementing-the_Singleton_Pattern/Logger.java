package WEEK_1.Design_Pattern.Exercise_1_Singleton;

public class Logger {
    private static Logger l;

    private Logger() {
        System.out.println("Logger Instance created");
    }

    public static Logger getLogger(){
        if(l == null){
            l = new Logger();
        }
        return l;
    }

}
