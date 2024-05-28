package org.lessons;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TicketTest {
    @Test
    void testPrice() throws InvalidNumberException{
        double newPrice = Ticket.calcPrice(15, 10);
        double newPrice1 = Ticket.calcPrice(15, 18);
        double newPrice2 = Ticket.calcPrice(15, 70);
        // double newPrice3 = Ticket.calcPrice(-15, 18);
        // double newPrice4 = Ticket.calcPrice(15, -18);
        assertEquals(2.52, newPrice);
        assertEquals(3.15, newPrice1);
        assertEquals(1.89, newPrice2);
        // assertEquals(2.52, newPrice3);
        // assertEquals(2.52, newPrice4);
    }
}
