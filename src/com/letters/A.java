package com.letters;

public class A {

    protected String a;
    public X x = new X("xxx");

    public A (String str, X x) {
        this.a = str;
        this.x = x;
    }

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
                ", x=" + x +
                '}';
    }
}
