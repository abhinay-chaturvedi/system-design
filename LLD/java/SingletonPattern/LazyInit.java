package SingletonPattern;

public class LazyInit {
    private static LazyInit instance;
    private LazyInit() {};


    public static LazyInit getInstance() {

        if(instance == null) {
            System.out.println("Creating instance Lazy init");
            instance = new LazyInit();
        }
        return instance;
    }
}
