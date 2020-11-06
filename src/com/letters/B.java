package com.letters;

public class B extends A {
    protected String b;

    public B(String str) {
        super();
        this.b = str;

    }

    public B() {
        this.b = "b";
    }

    @Override
    public String toString() {
        return super.toString() + "\nB{" +
                "b='" + b + '\'' +
                ", x=" + x +
                '}';
    }
}
