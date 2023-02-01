import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.javaqamvn.services.SqrtService;

public class SqrtServiceTest {

    @Test
    public void shouldCalcExact() {
        SqrtService service = new SqrtService();

        int expected = 8;
        int actual = service.calcSqrt(100,300 );

        Assertions.assertEquals(expected, actual);
    }

}