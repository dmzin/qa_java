import com.example.Feline;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTests {

    private Feline feline;

    @Before
    public void setup() {
        feline = new Feline();
    }

    @Test
    public void eatMeatReturnsListPredatorsMeal() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getFamilyReturnsFeline() {
        assertEquals("Вид должен быть Кошачьи", "Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensWithoutParamReturnsOne() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensWithParamReturnKittensCount() {
        assertEquals(5, feline.getKittens(5));
    }
}
