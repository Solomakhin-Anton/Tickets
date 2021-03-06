package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket implements Comparable<Ticket> {
    int id;
    int price;
    String arrival;
    String departure;
    int time;

    @Override
    public int compareTo(Ticket o) {
        return price - o.getPrice();
    }
}