package com.letters;

public class B extends A {
    public String b;

    public B(String str) {
        this.b = str;
    }

    public B() {
        this.b = "b";
    }

    @Override
    public String toString() {
        return super.toString() + "\nB{" +
                "b='" + b + '\'' +
                '}';
    }
}
