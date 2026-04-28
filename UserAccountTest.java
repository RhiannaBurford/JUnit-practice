import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class UserAccountTest {

    private UserAccount u;

    @BeforeEach
    public void setUp(){
        u = new UserAccount();
    }

    @Test 
    public void testLegalAge(){
        boolean result = u.isOver18(20);
        assertTrue(result, "A user aged 20 should be considered over 18");
    }
}
