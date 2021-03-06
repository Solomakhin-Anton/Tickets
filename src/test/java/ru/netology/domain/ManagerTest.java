package ru.netology.domain;

import org.junit.jupiter.api.Test;
import ru.netology.manager.TicketManager;
import ru.netology.repository.TicketRepository;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
    TicketRepository repo = new TicketRepository();
    TicketManager manager = new TicketManager(repo);

    @Test
    void shouldFindAll() {
        Ticket[] expected = {new Ticket(1, 1299, "SVO", "KZN", 95),
                new Ticket(9, 4114, "SVO", "KZN", 95),
                new Ticket(10, 4114, "SVO", "KZN", 95)};
        Ticket[] actual = manager.findAll("KZN", "SVO");
        assertArrayEquals(expected, actual);

    }

    @Test
    void shouldFindAllNegative() {
        Ticket[] expected = {};
        Ticket[] actual = manager.findAll("KZN", "LED");
        assertArrayEquals(expected, actual);

    }
}