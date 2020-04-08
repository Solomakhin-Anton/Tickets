package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Repository {
    Ticket [] list = {new Ticket(1, 1299,"SVO", "KZN", 95),
            new Ticket(2, 2199, "VKO", "KZN", 95),
            new Ticket(3, 2385, "VKO", "KZN", 90),
            new Ticket(4, 3100, "DME", "KZN", 90),
            new Ticket(5, 3100, "DME", "KZN", 95),
            new Ticket(6, 3100,"DME", "KZN", 95),
            new Ticket(7, 3100, "DME", "KZN", 95),
            new Ticket(8, 3100, "DME", "KZN", 95),
            new Ticket(9, 4114, "SVO", "KZN", 100),
            new Ticket(10, 4114, "SVO", "KZN", 85)};




    Ticket[] getAll() {
        return list;
    }

    void save(Ticket ticket) {
        int length = list.length + 1;
        Ticket[] addedTicket = new Ticket[length];
        for (int i = 0; i < list.length; i++) {
            addedTicket[i] = list[i];
        }
        int lastIndex = addedTicket.length - 1;
        addedTicket[lastIndex] = ticket;
        list = addedTicket;
    }

    void removeById(int id) {
        boolean exist = false;
        for (Ticket item : list) {
            if (item.getId() == id) {
                exist = true;
                break;
            }
        }
        if (exist) {
            int length = list.length - 1;
            Ticket[] newArray = new Ticket[length];
            int index = 0;
            for (Ticket item : list) {
                if (item.getId() != id) {
                    newArray[index] = item;
                    index++;
                }
            }
            list = newArray;
        }
    }
}
