package at.campus02.swe.parser;

import java.io.File;
import java.io.FileNotFoundException;

import org.junit.Test;
import static org.mockito.Mockito.*;

import at.campus02.swe.Calculator;
import at.campus02.swe.Calculator.Operation;


public class ParserTest {

    @Test(expected = IllegalArgumentException.class)
    public void testNullParser() {
        new Parser(null);
    }

    @Test(expected = FileNotFoundException.class)
    public void testParserInvalidFile() throws Exception {

        Calculator cal = mock(Calculator.class);

        Parser parser = new Parser(cal);
        parser.parse(new File("invalid"));
    }

    @Test
    public void testParserTest01Xml() throws Exception {

        Calculator cal = mock(Calculator.class);

        Parser parser = new Parser(cal);
        parser.parse(new File("src/test/resources/test01.xml"));

        verify(cal).push(1.0);
        verify(cal).push(2.0);
        verify(cal).perform(Operation.add);

        verifyNoMoreInteractions(cal);
    }
    @Test
    public void testParserModulo() throws Exception {

        Calculator cal = mock(Calculator.class);

        Parser parser = new Parser(cal);
        parser.parse(new File("src/test/resources/testModulo.xml"));

        verify(cal).push(7.0);
        verify(cal).push(3.0);
        verify(cal).perform(Operation.mod);

        verifyNoMoreInteractions(cal);
    }
    @Test
    public void testDotProductOfTwoElementVectorsFromXml() throws Exception {
        Calculator calc = new at.campus02.swe.logic.CalculatorImpl();
        Parser parser = new Parser(calc);

        double result = parser.parse(
                new File("src/test/resources/dotproduct-length-two.xml"));

        org.junit.Assert.assertEquals(14.0, result, 1e-9);
    }

    @Test
    public void testDotProductOfOneElementVectorsFromXml() throws Exception {
        Calculator calc = new at.campus02.swe.logic.CalculatorImpl();
        Parser parser = new Parser(calc);

        double result = parser.parse(
                new File("src/test/resources/dotproduct-length-one.xml"));

        org.junit.Assert.assertEquals(6.0, result, 1e-9);
    }
}