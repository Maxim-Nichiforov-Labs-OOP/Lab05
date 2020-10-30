package com.letters;

public class H extends G {
    public String h;

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
                '}';
    }
}
