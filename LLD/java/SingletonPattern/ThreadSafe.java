package SingletonPattern;

public class ThreadSafe {
    private static ThreadSafe instance;
    private ThreadSafe(){};

    public static synchronized ThreadSafe getInstance() {

        if(instance == null){
            System.out.println("creating instance thread safe");
            instance = new ThreadSafe();
        }
        return instance;
    }
    
}
