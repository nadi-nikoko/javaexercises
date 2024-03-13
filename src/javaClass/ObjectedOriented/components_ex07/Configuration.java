package javaClass.ObjectedOriented.components_ex07;

import java.util.ArrayList;

public class Configuration {
    private ArrayList<Component> computer;

    public Configuration() {
        this.computer = new ArrayList<>();
    }

    public boolean add(Component component) {
        for (Component part : this.computer) {
            if (!part.getIncompatibile(component)) {
                this.computer.add(component);
                return true;
            }
        }
        if (this.computer.size() == 0) {
            this.computer.add(component);
            return true;
        }
        return false;
    }

}