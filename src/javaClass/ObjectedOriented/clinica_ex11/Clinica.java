package javaClass.ObjectedOriented.clinica_ex11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javaClass.ObjectedOriented.clinica_ex11.Schedule.Specialista;

public class Clinica {

    private List<Schedule> timeSchedule;

    public Clinica() {
        this.timeSchedule = new ArrayList<>();
    }

    public static void main(String[] args) {
        Clinica c = new Clinica();
        c.prenota(Schedule.Specialista.OCULISTA, "Pippo Franco");
        c.prenota(Schedule.Specialista.OCULISTA, "Leo Gullotta");
        c.prenota(Schedule.Specialista.OCULISTA, "Leo Gullotta");
        c.prenota(Schedule.Specialista.PEDIATRA, "Ciccio Ingrassia");
        c.prenota(Schedule.Specialista.PEDIATRA, "Leo Gullotta");
        c.cancellaPrenotazione(Schedule.Specialista.PEDIATRA, "Ciccio Ingrassia");
        Collection<String> ocu = c.getPrenotati(Schedule.Specialista.OCULISTA);
        System.out.println(ocu);
        System.out.println(c.getPrenotati(Schedule.Specialista.PEDIATRA));
    }

    private Collection<String> getPrenotati(Specialista specialista) {
        Collection<String> tempCollection = new ArrayList<>();
        for (Schedule schedule : timeSchedule) {
            if (specialista.equals(schedule.getSpecialista())) {
                tempCollection.add(schedule.getName());
            }
        }
        return tempCollection;
    }

    private void cancellaPrenotazione(Specialista specialista, String name) {
        for (Schedule schedule : timeSchedule) {
            if (name.equals(schedule.getName())) {
                timeSchedule.remove(schedule);
                return;
            }
        }
    }

    private void prenota(Specialista specialista, String name) {
        boolean nameUsed = false;
        for (Schedule schedule : timeSchedule) {
            if (name.equals(schedule.getName())) {
                nameUsed = true;
                System.out.println("this name was already use for a booking");
            }
        }
        if (!nameUsed) {
            Schedule newSchedule = new Schedule(specialista, name);
            timeSchedule.add(newSchedule);
        }
    }
}
