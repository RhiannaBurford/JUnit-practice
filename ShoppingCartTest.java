import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ShoppingCartTest {

    @Test
    public void testAddTax(){
        ShoppingCart sc = new ShoppingCart();
        double result = sc.addTax(8.0);
        assertEquals(9.6, result, 0.001);
    }
}
