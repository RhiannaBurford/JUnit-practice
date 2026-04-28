import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UserValidatorTest {

    @Test
    public void testShortName(){
        UserValidator uv = new UserValidator();
        String result = uv.checkUsername("Ab");
        assertEquals("Too Short", result);
    }

    @Test
    public void testValidName(){
        UserValidator uv = new UserValidator();
        String result = uv.checkUsername("James");
        assertEquals("Valid", result);
    }
}
