

public class Singleton {

    String a;
    private Singleton instance = null;
    private Singleton() {

        a= "asd";
        // Exists only to defeat instantiation.
    }
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new ClassicSingleton();
        }
        return instance;
    }

    public String getText(){

        return a;
    }
}
