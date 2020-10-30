package com.letters;

public class E extends D {
    public String e;

    public E(String str) {
        super();
        this.e = str;
    }

    public E() {
        this.e = "e";
    }

    @Override
    public String toString() {
        return super.toString() + "\nE{" +
                "e='" + e + '\'' +
                '}';
    }
}
