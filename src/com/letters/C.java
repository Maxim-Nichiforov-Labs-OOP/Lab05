package com.letters;

public class C extends B {

    public String c;

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
                '}';
    }
}
