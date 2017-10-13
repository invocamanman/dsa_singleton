import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class test {


    @Test
    public void testGetIdioma(){

        String text = Singleton.getInstance().getText("ca","CA");
        assertEquals("Holaa",text);

    }

}
