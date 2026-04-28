import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class SharedDataTest {

    private SharedData sd;

    @BeforeEach
    public void setUp(){
        sd = new SharedData();
    }

    @Test
    public void testGetVersion(){
        String result = sd.getVersion();
        assertEquals("1.0", result);
    }

}
