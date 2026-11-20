
package at.campus02.swe;

import at.campus02.swe.logic.CalculatorImpl;
import at.campus02.swe.parser.Parser;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.io.File;

public class EndToEndTest {

    @Test
    public void testAdditionAndMultiplication() throws Exception {


        Calculator calc = new CalculatorImpl();
        Parser parser = new Parser(calc);


        double result = parser.parse(
                new File("src/test/resources/e2eTest01.xml"));


        assertEquals(30.0, result, 0.001);
    }

    @Test
    public void testSubtractionAndDivision() throws Exception {


        Calculator calc = new CalculatorImpl();
        Parser parser = new Parser(calc);


        double result = parser.parse(
                new File("src/test/resources/e2eTest02.xml"));


        assertEquals(4.0, result, 0.001);
    }
}
