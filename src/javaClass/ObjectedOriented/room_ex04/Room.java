package javaClass.ObjectedOriented.room_ex04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Room {

    private ArrayList<Reservation> listReservation;

    public Room() {
        this.listReservation = new ArrayList<Reservation>();
    }

    public Reservation reserve(String name, int dayIN, int dayOUT) {
        if (isReserved(dayIN, dayOUT)) {
            Reservation newReservation = new Reservation(name, dayIN, dayOUT);
            this.listReservation.add(newReservation);
            return newReservation;
        } else
            throw new RuntimeException("room is boked for this days");
    }

    public List<Reservation> reservations() {
        List<Reservation> orderlist = this.listReservation.stream()
                .sorted(Comparator.comparing(Reservation::getDayIN))
                .collect(Collectors.toList());
        return orderlist;
    }

    private boolean isReserved(int dayIN, int dayOUT) {
        for (Reservation current : listReservation) {
            if (current.isOverlapped(dayIN, dayOUT)) {
                return true;
            }
        }
        return false;
    }
}
