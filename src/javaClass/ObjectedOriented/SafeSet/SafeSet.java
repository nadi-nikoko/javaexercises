package javaClass.ObjectedOriented.SafeSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SafeSet<T> {

    private Set<String> setList;
    private List<Integer> controlList;

    public SafeSet() {
        this.setList = new HashSet<>();
        this.controlList = new ArrayList<>();
    }

    public Set<String> getSetList() {
        return setList;
    }

    public void setSetList(Set<String> setList) {
        this.setList = setList;
    }

    public List<Integer> getControlList() {
        return controlList;
    }

    public void setControlList(List<Integer> controlList) {
        this.controlList = controlList;
    }

    public static void main(String[] args) {
        SafeSet<String> a = new SafeSet<>();
        System.out.println(a.add("ciao")); // true
        System.out.println(a.add("mondo")); // true
        System.out.println(a.remove("ciao")); // true
        System.out.println(a.contains("ciao")); // false
        System.out.println(a.remove("ciao")); // true
        System.out.println(a.contains("ciao")); // false
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((setList == null) ? 0 : setList.hashCode());
        result = prime * result + ((controlList == null) ? 0 : controlList.hashCode());
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
        SafeSet other = (SafeSet) obj;
        if (setList == null) {
            if (other.setList != null)
                return false;
        } else if (!setList.equals(other.setList))
            return false;
        if (controlList == null) {
            if (other.controlList != null)
                return false;
        } else if (!controlList.equals(other.controlList))
            return false;
        return true;
    }

    private boolean contains(String word) {
        if (findIndex(word) != -1) {
            int index = findIndex(word);
            if (this.setList.contains(word) && controlList.get(index) == 0)
                return false;
            if (this.setList.contains(word) && controlList.get(index) == 1) {
                return true;
            }
        }
        return false;
    }

    private boolean remove(String word) {
        if (findIndex(word) != -1) {
            int index = findIndex(word);
            if (setList.contains(word) && controlList.get(index) == 1) {
                controlList.set(index, 0);
                return true;
            }
            if (setList.contains(word) && controlList.get(index) == 0) {
                setList.remove(word);
                return true;
            }
        }
        return false;
    }

    public boolean add(String word) {
        this.setList.add(word);
        this.controlList.add(1);
        return true;
    }

    public int findIndex(String word) {
        int index = 0;
        for (String current : setList) {
            if (word.equals(current)) {
                return index;
            }
            index++;
        }
        return -1;
    }
}