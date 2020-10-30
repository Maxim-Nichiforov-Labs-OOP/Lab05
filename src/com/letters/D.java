package com.letters;

public class D extends C {
    public String d;

    public D(String str) {
        super();
        this.d = str;
    }

    public D() {
        this.d = "d";
    }

    @Override
    public String toString() {
        return super.toString() + "\nD{" +
                "d='" + d + '\'' +
                '}';
    }
}
