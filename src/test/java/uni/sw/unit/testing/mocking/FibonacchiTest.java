package uni.sw.unit.testing.mocking;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;

import uni.sw.unit.testing.Fibonacchi;

public class FibonacchiTest {
    @Test
    @ExtendWith(MockitoExtension.class)
    public void fibonacchiTest(){
        Fibonacchi mockFibonacchi = Mockito.mock(Fibonacchi.class);
        when(mockFibonacchi.getFibonacchiElement(15)).thenReturn(377);
        assertEquals(377, mockFibonacchi.getFibonacchiElement(15), "The 15th element of fibonacchi should be 377");

        when(mockFibonacchi.getFibonacchiElement(20)).thenReturn(4181);
        assertEquals(4181, mockFibonacchi.getFibonacchiElement(20), "The 15th element of fibonacchi should be 4181");
    }
}
