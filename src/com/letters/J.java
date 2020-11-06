package com.letters;

public class J extends I {
    protected String j;

    public J(String str) {
        super();
        this.j = str;
    }

    public J() {
        this.j = "j";
    }

    @Override
    public String toString() {
        return super.toString() + "\nJ{" +
                "j='" + j + '\'' +
                ", x=undefined" +
                '}';
    }
}
