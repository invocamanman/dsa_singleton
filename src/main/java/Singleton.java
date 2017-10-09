

public class Singleton {

    String a;
    private static Singleton instance = null;
    private Singleton() {

        a= "asd";
        // Exists only to defeat instantiation.
    }
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public String getText(){

        return a;
    }
}
