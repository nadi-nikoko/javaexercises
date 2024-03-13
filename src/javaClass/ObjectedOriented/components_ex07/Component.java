package javaClass.ObjectedOriented.components_ex07;

import java.util.ArrayList;

public class Component {
    public enum Type {
        CPU, BOARD, RAM;
    }

    private Type type;
    private String description;
    private ArrayList<Component> incompatibile;

    public Component(Type type, String description) {
        this.type = type;
        this.description = description;
        this.incompatibile = new ArrayList<>();
    }

    public void setIncompatible(Component component) {
        this.incompatibile.add(component);
    }

    public boolean getIncompatibile(Component component) {
        for (Component inc : incompatibile) {
            if (inc.equals(component)) {
                return true;
            }
        }
        if (this.type == component.getType()) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((description == null) ? 0 : description.hashCode());
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
        Component other = (Component) obj;
        if (description == null) {
            if (other.description != null)
                return false;
        } else if (!description.equals(other.description))
            return false;
        return true;
    }

    public Type getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

}
