import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTests {

    @Test
    public void eatMeatReturnsListPredatorsMeal() throws Exception {
        Feline feline = new Feline();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getFamilyReturnsFeline() {
        Feline feline = new Feline();
        assertEquals("Вид должен быть Кошачьи", "Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensWithoutParamReturnsOne() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensWithParamReturnKittensCount() {
        Feline feline = new Feline();
        assertEquals(5, feline.getKittens(5));
    }
}
