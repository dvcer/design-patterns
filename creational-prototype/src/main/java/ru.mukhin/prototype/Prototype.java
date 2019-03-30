package ru.mukhin.prototype;

public abstract class Prototype implements Cloneable {
    public abstract String getName();

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;

    }
}
