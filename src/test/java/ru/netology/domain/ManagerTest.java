package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
    Repository repo = new Repository();
    Manager manager = new Manager(repo);

    @Test
    void shouldFindAll() {
        Ticket[] expected = {
                new Ticket(10, 4114, "SVO", "KZN", 85),
                new Ticket(1, 1299,"SVO", "KZN", 95),
                new Ticket(9, 4114, "SVO", "KZN", 100)};
        Ticket[] actual = manager.findAll("KZN", "SVO", new TicketByPriceAscComparator());
        assertArrayEquals(expected, actual);

    }

    @Test
    void shouldFindAllNegative() {
        Ticket[] expected = {};
        Ticket[] actual = manager.findAll("KZN", "LED", new TicketByPriceAscComparator());
        assertArrayEquals(expected, actual);

    }
}