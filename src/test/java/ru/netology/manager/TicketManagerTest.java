package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Ticket;
import ru.netology.repository.TicketRepository;

public class TicketManagerTest {
    @Test
    public void testSortTickets() {
        TicketRepository repository = new TicketRepository();
        TicketManager manager = new TicketManager(repository);
        Ticket ticket1 = new Ticket(1, 150, "MOW", "KZN", 95);
        Ticket ticket2 = new Ticket(2, 250, "MOW", "LED", 99);
        Ticket ticket3 = new Ticket(3, 170, "MOW", "LED", 100);
        Ticket ticket4 = new Ticket(4, 500, "NEW", "LA", 250);
        Ticket ticket5 = new Ticket(5, 900, "MOW", "NEW", 480);
        Ticket ticket6 = new Ticket(6, 210, "MOW", "LED", 80);
        Ticket ticket7 = new Ticket(7, 270, "MOW", "LED", 90);
        Ticket ticket8 = new Ticket(8, 210, "MOW", "LED", 85);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] expected = {ticket3, ticket6, ticket8, ticket2, ticket7};
        Ticket[] actual = manager.findAll("MOW", "LED");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortNotExistTickets() {
        TicketRepository repository = new TicketRepository();
        TicketManager manager = new TicketManager(repository);
        Ticket ticket1 = new Ticket(1, 150, "MOW", "KZN", 95);
        Ticket ticket2 = new Ticket(2, 250, "MOW", "LED", 99);
        Ticket ticket3 = new Ticket(3, 170, "MOW", "LED", 100);
        Ticket ticket4 = new Ticket(4, 500, "NEW", "LA", 250);
        Ticket ticket5 = new Ticket(5, 900, "MOW", "NEW", 480);
        Ticket ticket6 = new Ticket(6, 210, "MOW", "LED", 80);
        Ticket ticket7 = new Ticket(7, 270, "MOW", "LED", 90);
        Ticket ticket8 = new Ticket(8, 210, "MOW", "LED", 85);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] expected = {};
        Ticket[] actual = manager.findAll("MOW", "LA");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortOneTicket() {
        TicketRepository repository = new TicketRepository();
        TicketManager manager = new TicketManager(repository);
        Ticket ticket1 = new Ticket(1, 150, "MOW", "KZN", 95);
        Ticket ticket2 = new Ticket(2, 250, "MOW", "LED", 99);
        Ticket ticket3 = new Ticket(3, 170, "MOW", "LED", 100);
        Ticket ticket4 = new Ticket(4, 500, "NEW", "LA", 250);
        Ticket ticket5 = new Ticket(5, 900, "MOW", "NEW", 480);
        Ticket ticket6 = new Ticket(6, 210, "MOW", "LED", 80);
        Ticket ticket7 = new Ticket(7, 270, "MOW", "LED", 90);
        Ticket ticket8 = new Ticket(8, 210, "MOW", "LED", 85);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] expected = {ticket4};
        Ticket[] actual = manager.findAll("NEW", "LA");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortPriceTickets() {
        TicketRepository repository = new TicketRepository();
        TicketManager manager = new TicketManager(repository);
        Ticket ticket1 = new Ticket(1, 150, "MOW", "KZN", 95);
        Ticket ticket2 = new Ticket(2, 170, "MOW", "LED", 100);
        Ticket ticket3 = new Ticket(3, 210, "MOW", "LED", 80);
        Ticket ticket4 = new Ticket(4, 210, "MOW", "LED", 85);
        Ticket ticket5 = new Ticket(5, 250, "MOW", "LED", 99);
        Ticket ticket6 = new Ticket(6, 270, "MOW", "LED", 90);
        Ticket ticket7 = new Ticket(7, 500, "NEW", "LA", 250);
        Ticket ticket8 = new Ticket(8, 900, "MOW", "NEW", 480);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] expected = {ticket2, ticket3, ticket4, ticket5, ticket6};
        Ticket[] actual = manager.findAll("MOW", "LED");

        Assertions.assertArrayEquals(expected, actual);
    }
}
