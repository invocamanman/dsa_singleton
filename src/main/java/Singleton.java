import java.util.Locale;
import java.util.ResourceBundle;

public class Singleton {

    String a;
    private static Singleton instance = null;
    private Singleton() {

        a= "ca";
        // Exists only to defeat instantiation.
    }
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public String getText(){

        Locale local = new Locale(a);
        ResourceBundle label1 = ResourceBundle.getBundle("I18N", local);
        return label1.getString("T1");
    }
}
