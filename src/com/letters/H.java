package com.letters;

public class H extends G {
    protected String h;
    private X x = new X("another another initial value");

    public H(String str) {
        super();
        this.h = str;
    }

    public H() {
        this.h = "h";
    }

    @Override
    public String toString() {
        return super.toString() + "\nH{" +
                "h='" + h + '\'' +
                ", x=" + x +
                '}';
    }
}
