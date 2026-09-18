import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathTest {
    @ParameterizedTest
    @CsvSource({
            "6, 5",
            "1.5, 3.7",
            "-3.4, -5.2",
            "-2, -4",
            "5, -6",
            "3.5, -4.3",
            "-4, 6",
            "-6.4, 5.98",
            "0, 0",
            "0, -1.4",
            "0, -4",
            "0, 1.4",
            "0, 4",
            "1, 0",
            "1, -1.4",
            "1, -4",
            "1, 1.4",
            "1, 4",
            "-1, 0",
            "-1, -1.4",
            "-1, -4",
            "-1, 1.4",
            "-1, 4",
            "0, 1",
            "-1.4, 1",
            "-4, 1",
            "1.4, 1",
            "4, 1"
    })

    public void testReciprocal(double base, double exponent) {
       double x = 0;
       x += 1/(Math.pow(base, exponent));
       assertEquals(1/(Math.pow(base,exponent)), x);
    }
//    @ParameterizedTest
//    @CsvSource({
//            "6, 5, 17",
//            "5, 2, -3",
//            "3, -3, -4",
//            "-7, 2, 4",
//            "-4, -5, 2",
//            "-7, -8, -9",
//            "6.3, 5.5, 17.3",
//            "5.25, 2.4, -3.2",
//            "3.4, -3.3, -4.2",
//            "-7.5, 2.2, 4.6",
//            "-4.3, -5.2, 2.1",
//            "-7.4, -8.3, -9.2"
//    })
//    public void testMultiplying(double base, double a, double b) {
//        double y = base;
//        double exp = a+b;
//        assertEquals((Math.pow(y,a)*Math.pow(y,b)), Math.pow(y, exp));
//    }


}
