package javaClass.ObjectedOriented.bug_08;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Bug {
    private String error;
    private static Set<Bug> unassignedBugs = new HashSet<>();
    private static ArrayList<Programmer> prog;
    private static String currentProg;

    public Bug(String error) {
        this.error = error;
        unassignedBugs.add(this);
        Bug.prog = new ArrayList<>();
    }

    public static void main(String[] args) {
        Bug b1 = new Bug("Application crashes on Windows 8"),
                b2 = new Bug("Application freezes after 2 hours"),
                b3 = new Bug("Application does not print on laser printer"),
                b4 = new Bug("Data missing after partial save");
        Set<Bug> unassigned = Bug.getUnassigned();
        System.out.println(unassigned.size());
        b2.assignTo("Paolo");
        b3.assignTo("Filomena");
        b4.assignTo("Filomena");
        System.out.println(unassigned.size());
        Set<Bug> lo = Bug.getAssignedTo("Filomena");
        System.out.println(lo);
    }

    private static Set<Bug> getUnassigned() {
        return unassignedBugs;
    }

    private static Set<Bug> getAssignedTo(String string) {
        for (Programmer p : prog) {
            if (string.equals(p.getName())) {
                currentProg = p.getName();
                return p.getBugsList();
            }
        }
        return null;
    }

    private void assignTo(String string) {
        for (Programmer p : prog) {
            if (string.equals(p.getName())) {
                p.add(this);
                unassignedBugs.remove(this);
                return;
            }
        }
        Bug.prog.add(new Programmer(string, this));
        unassignedBugs.remove(this);
    }

    // get, set, equal, to string...

    public ArrayList<Programmer> getProg() {
        return prog;
    }

    @Override
    public String toString() {
        return "error=" + error + ", prog=" + currentProg;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public static Set<Bug> getUnassignedBugs() {
        return unassignedBugs;
    }

    public static void setUnassignedBugs(Set<Bug> unassignedBugs) {
        Bug.unassignedBugs = unassignedBugs;
    }

}

class Programmer {
    private String name;
    private Set<Bug> bugsList;

    public Programmer(String name, Bug error) {
        this.name = name;
        bugsList = new HashSet();
        bugsList.add(error);
    }

    // get, set, equals and to string
    @Override
    public String toString() {
        return "Programmer " + name;
    }

    public void add(Bug error) {
        this.bugsList.add(error);
    }

    public String getName() {
        return name;
    }

    public Set<Bug> getBugsList() {
        return bugsList;
    }

    public void setBugsList(Set<Bug> bugsList) {
        this.bugsList = bugsList;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
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
        Programmer other = (Programmer) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
}
