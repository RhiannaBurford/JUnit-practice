import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GradeCalculatorTest {

    @Test
    public void testAverage(){
        GradeCalculator gc = new GradeCalculator();
        double result = gc.calculateAverage(80, 90);
        assertEquals(85.0, result, 0.01); // expected, actual, delta
    }

}
