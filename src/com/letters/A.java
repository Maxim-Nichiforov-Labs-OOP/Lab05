package com.letters;

public class A {

    public String a;

    public A (String str) {
        this.a = str;
    }

    public A () {
        this.a = "a";
    }

    @Override
    public String toString() {
        return "A{" +
                "a='" + a + '\'' +
                '}';
    }
}
