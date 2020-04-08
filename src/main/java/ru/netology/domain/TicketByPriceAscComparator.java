package ru.netology.domain;

import java.util.Comparator;

public class TicketByPriceAscComparator implements Comparator<Ticket> {

    @Override
    public int compare(Ticket o1, Ticket o2) {
        if (o1.getTime() > o2.getTime())
            return 1;
        if (o1.getTime() < o2.getTime())
            return -1;
        return 0;
    }

}

