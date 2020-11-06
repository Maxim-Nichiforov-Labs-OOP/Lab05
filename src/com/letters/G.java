package com.letters;

public class G extends F {
    protected String g;

    public G(String str) {
        super();
        this.g = str;
    }

    public G() {
        this.g = "g";
    }

    @Override
    public String toString() {
        return super.toString() + "\nG{" +
                "g='" + g + '\'' +
                ", x=" + x +
                '}';
    }
}
