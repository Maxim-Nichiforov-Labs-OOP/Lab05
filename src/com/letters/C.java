package com.letters;

public class C extends B {

    protected String c;

    public C(String str) {
        super();
        this.c = str;
    }
    public C() {
        this.c = "c";
    }

    @Override
    public String toString() {
        return super.toString() + "\nC{" +
                "c='" + c + '\'' +
                ", x=" + x +
                '}';
    }
}
