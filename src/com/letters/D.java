package com.letters;

public class D extends C {
    protected String d;
    public X x = new X("another initial value");

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
                ", x=" + x +
                '}';
    }
}
