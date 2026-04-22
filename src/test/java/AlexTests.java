import com.example.Alex;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class AlexTests {

    private Alex alex;

    @Mock
    Feline feline;

    @Before
    public void setup() throws Exception {
        alex = new Alex(feline);
    }

    @Test
    public void getFriendsReturnsCorrectList() throws Exception {
        assertEquals(List.of("Марти", "Глория", "Мелман"), alex.getFriends());
    }

    @Test
    public void getPlaceOfLivingReturnsZoo() throws Exception {
        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    public void getKittensReturnsZero() throws Exception {
        assertEquals(0, alex.getKittens());
    }

    @Test
    public void doesHaveManeReturnsTrue() throws Exception {
        assertEquals(true, alex.doesHaveMane());
    }
}
