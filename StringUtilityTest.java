import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StringUtilityTest {

    @Test
    public void testGetLength(){
        StringUtility su = new StringUtility();
        int result = su.getLength("Hello");

        assertEquals(5, result);
    }
}
