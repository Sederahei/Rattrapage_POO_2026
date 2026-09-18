
import dev.sedera.hei.Bottom;
import dev.sedera.hei.Order;
import dev.sedera.hei.Top;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import java.time.LocalDate;


public class OrderTest {
    @Test
    public void testGetTotalAmount() {
        Order order = new Order(LocalDate.now(), "Multiple items orders");

        Top polo = new Top("Polo Shirt", "L", 30.0, "cotton", "short");
        Bottom shorts = new Bottom("Shorts", "M", 25.0, "nylon", 34);
        Bottom trousers = new Bottom("Trousers", "XL", 60.0, "cotton", 36);


        order.addItem(polo, 3);
        order.addItem(shorts, 2);
        order.addItem(trousers, 1);

        assertEquals(200.0, order.getTotalAmount(), 0.001);
    }
}