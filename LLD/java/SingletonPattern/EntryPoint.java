package SingletonPattern;

public class EntryPoint {
    
    public static void main(String args[]) {
        System.out.println("Calling main method");
        LazyInit obj = LazyInit.getInstance();
        ThreadSafe obj1 = ThreadSafe.getInstance();
        System.out.println(obj.toString());
        System.out.println(obj1.toString());;
    }
}
