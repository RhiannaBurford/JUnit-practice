import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


public class DataServiceTest {

    private DataService ds;

    @BeforeEach
    public void setUp(){
        ds = new DataService();
    }

    @Test 
    public void testGetNumbers(){
        int[] actual = ds.getNumbers();
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, actual);
    }


    @Test 
    public void testGetGreeting(){
        String result = ds.getGreeting();
        assertEquals("Hello", result);
    }
}
