import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class MembershipSystemTest {

    private MembershipSystem ms;

    @BeforeEach
    public void setUp(){
        ms = new MembershipSystem();
    }

    @Test
    public void testGoldTier(){
        String result = ms.getTier(150);
        assertEquals("Gold", result);
    }

    @Test 
    public void testSilverTier(){
        String result = ms.getTier(50);
        assertEquals("Silver", result);
    }
}
