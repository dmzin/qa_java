import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@RunWith(MockitoJUnitRunner.class)
public class LionTests {

    @Mock
    Feline feline;

    @Test
    public void constructorThrowsExceptionForInvalidSex() {
        try {
            new Lion("Неизвестно", feline);
            fail("Ожидалось исключение");
        } catch (Exception exception) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage()
            );
        }
    }

    @Test
    public void getKittensDelegatesToFeline() throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(3);
        Lion lion = new Lion("Самец", feline);
        assertEquals(3, lion.getKittens());
    }

    @Test
    public void getFoodDelegatesToFeline() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Lion lion = new Lion("Самец", feline);
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
}
