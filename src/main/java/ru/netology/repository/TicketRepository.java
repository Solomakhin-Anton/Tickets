package ru.netology.repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.domain.Ticket;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketRepository {
    Ticket[] tickets = {new Ticket(1, 1299, "SVO", "KZN", 95),
            new Ticket(2, 2199, "VKO", "KZN", 95),
            new Ticket(3, 2385, "VKO", "KZN", 90),
            new Ticket(4, 3100, "DME", "KZN", 90),
            new Ticket(5, 3100, "DME", "KZN", 95),
            new Ticket(6, 3100, "DME", "KZN", 95),
            new Ticket(7, 3100, "DME", "KZN", 95),
            new Ticket(8, 3100, "DME", "KZN", 95),
            new Ticket(9, 4114, "SVO", "KZN", 100),
            new Ticket(10, 4114, "SVO", "KZN", 85)};


    public Ticket[] getAll() {
        return tickets;
    }

    void save(Ticket ticket) {
        int length = tickets.length + 1;
        Ticket[] addedTicket = new Ticket[length];
        System.arraycopy(tickets, 0, addedTicket, 0, tickets.length);
        int lastIndex = addedTicket.length - 1;
        addedTicket[lastIndex] = ticket;
        tickets = addedTicket;
    }

    void removeById(int id) {
        boolean exist = false;
        for (Ticket item : tickets) {
            if (item.getId() == id) {
                exist = true;
                break;
            }
        }
        if (exist) {
            int length = tickets.length - 1;
            Ticket[] newArray = new Ticket[length];
            int index = 0;
            for (Ticket item : tickets) {
                if (item.getId() != id) {
                    newArray[index] = item;
                    index++;
                }
            }
            tickets = newArray;
        }
    }
}
