package ru.netology.manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.domain.Ticket;
import ru.netology.domain.TicketByPriceAscComparator;
import ru.netology.repository.TicketRepository;

import java.util.Arrays;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketManager {
    TicketRepository list;

    public Ticket[] findAll(String from, String to, TicketByPriceAscComparator comparator) {
        Ticket[] newList = new Ticket[0];
        for (Ticket ticket : list.getAll()) {
            if (ticket.getArrival().equals(to) && ticket.getDeparture().equals(from)) {
                Ticket[] tmp = new Ticket[newList.length + 1];
                System.arraycopy(newList, 0, tmp, 0, newList.length);
                tmp[tmp.length - 1] = ticket;
                newList = tmp;
                Arrays.sort(newList, comparator);
            }

        }

        return newList;
    }

}

