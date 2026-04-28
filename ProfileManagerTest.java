import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


public class ProfileManagerTest {

    private ProfileManager pf; // so it is visible to all the methods

    @BeforeEach
    public void setUp(){
        pf = new ProfileManager();
    }

    @Test
    public void testProfileNotFound(){
        String result = pf.getProfile(5);
        assertNull(result);

    }

}
