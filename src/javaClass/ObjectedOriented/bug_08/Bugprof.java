package javaClass.ObjectedOriented.bug_08;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Bugprof {

    private static Set<Bugprof> bugs = new HashSet<>();
    private static Set<Bugprof> unassigned = new HashSet<>();

    private String descr;
    private String assigned;

    public Bugprof(String descr) {
        this.descr = descr;
        assigned = null;
        unassigned.add(this);
    }

    public void assignTo(String name) {
        unassigned.remove(this);
        this.assigned = name;
        bugs.add(this);
    }

    /* statics ....... */

    public static Set<Bugprof> getUnassigned() {
        return unassigned;
    }

    public static Set<Bugprof> getAssignedTo(String name) {
        return bugs.stream().filter(v -> v.assigned != null && v.assigned.equals(name))
                .collect(Collectors.toSet());
    }

    /* getters etc.. */
    public String getDescr() {
        return descr;
    }

    public String getAssigned() {
        return assigned;
    }

    @Override
    public String toString() {
        return "Bugprof [descr=" + descr + ", assignedTo=" + assigned + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((descr == null) ? 0 : descr.hashCode());
        result = prime * result + ((assigned == null) ? 0 : assigned.hashCode());
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
        Bugprof other = (Bugprof) obj;
        if (descr == null) {
            if (other.descr != null)
                return false;
        } else if (!descr.equals(other.descr))
            return false;
        if (assigned == null) {
            if (other.assigned != null)
                return false;
        } else if (!assigned.equals(other.assigned))
            return false;
        return true;
    }

}
