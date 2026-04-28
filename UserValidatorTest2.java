import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class UserValidatorTest2 {

    private UserValidator uv;

    @BeforeEach
    public void setUp(){
        uv = new UserValidator();
    }

    @Test
    public void testShortName(){
        String result = uv.checkUsername("Ab");
        assertEquals("Too Short", result);
    }

    @Test
    public void testValidName(){
        String result = uv.checkUsername("James");
        assertEquals("Valid", result);
    }
}
