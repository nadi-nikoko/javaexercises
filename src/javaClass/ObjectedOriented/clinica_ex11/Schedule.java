package javaClass.ObjectedOriented.clinica_ex11;

public class Schedule {
    public enum Specialista {
        OCULISTA, PEDIATRA;
    }

    private String name;
    private Specialista specialista;

    public Schedule(Specialista specialista, String name) {
        this.specialista = specialista;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Specialista getSpecialista() {
        return specialista;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((specialista == null) ? 0 : specialista.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Schedule other = (Schedule) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (specialista != other.specialista)
            return false;
        return true;
    }
}
