import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MathProTest {

    @Test
    public void testIsPositive(){
        MathPro mp = new MathPro();
        boolean result = mp.isPositive(10);
        assertTrue(result);
    }
}
