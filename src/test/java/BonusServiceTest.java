import org.example.BonusService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BonusServiceTest {
    @Test
    void shouldCalculateBonuse() {
        BonusService service = new BonusService();
        int amount = 2000;

        int actual = service.calculateBonuse(amount);
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateOtherBonuse() {
        BonusService service = new BonusService();
        int amount = 1000;

        int actualResult = service.calculateBonuse(amount);
        int expectedResult = 0;
        Assertions.assertEquals(actualResult, expectedResult);
    }
}
