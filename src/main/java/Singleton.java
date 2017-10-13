import java.util.HashMap;
import java.util.Locale;
import java.util.ResourceBundle;

public class Singleton {

    String a;
    private static Singleton instance = null;
    private HashMap<String,Locale> idiomas = new HashMap<String,Locale>();

    private Singleton() {

        // Exists only to defeat instantiation.
    }
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public String getText(String idioma, String country){

        if(null == idiomas.get(country)){

            idiomas.put(country, new Locale(idioma,country));

        }

        Locale local = idiomas.get(country);
        ResourceBundle label1 = ResourceBundle.getBundle("I18N.Language", local);
        return label1.getString("T1");

    }
}
