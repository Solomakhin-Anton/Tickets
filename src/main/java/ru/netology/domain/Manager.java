package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Manager {
    Repository list;

    public Ticket[] findAll(String from, String to) {
        Ticket[] newList = new Ticket[0];
        for (Ticket ticket : list.getAll()) {
            if (ticket.arrival.equals(to) && ticket.departure.equals(from)) {
                Ticket[] tmp = new Ticket[newList.length + 1];
                System.arraycopy(newList, 0, tmp, 0, newList.length);
                tmp[tmp.length - 1] = ticket;
                newList = tmp;
                Arrays.sort(newList);
                System.out.println(ticket);
            }
        }
        return newList;
    }
}

