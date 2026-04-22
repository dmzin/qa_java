import com.example.Alex;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class AlexTests {

    @Mock
    Feline feline;

    @Test
    public void getFriendsReturnsCorrectList() throws Exception {
        Alex alex = new Alex(feline);
        assertEquals(List.of("Марти", "Глория", "Мелман"), alex.getFriends());
    }

    @Test
    public void getPlaceOfLivingReturnsZoo() throws Exception {
        Alex alex = new Alex(feline);
        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    public void getKittensReturnsZero() throws Exception {
        Alex alex = new Alex(feline);
        assertEquals(0, alex.getKittens());
    }

    @Test
    public void doesHaveManeReturnsTrue() throws Exception {
        Alex alex = new Alex(feline);
        assertEquals(true, alex.doesHaveMane());
    }
}
