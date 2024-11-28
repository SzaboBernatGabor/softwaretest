package uni.sw.unit.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FibonacchiTest {
    
    @Test
    @DisplayName("Test fibonacchi element")
    void testElements(){
        Fibonacchi fibonacchi = new Fibonacchi();
        assertEquals(fibonacchi.getFibonacchiElement(8), 13);
        assertEquals(fibonacchi.getFibonacchiElement(23), 17711);
    }
}
