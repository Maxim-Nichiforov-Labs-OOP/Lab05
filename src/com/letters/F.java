package com.letters;

public class F extends E {
    protected String f;

    public F(String str) {
        super(str);
        this.f = str;
    }

    public F() {
        this.f = "f";
    }

    @Override
    public String toString() {
        return super.toString() + "\nF{" +
                "f='" + f + '\'' +
                ", x=" + x +
                '}';
    }
}
