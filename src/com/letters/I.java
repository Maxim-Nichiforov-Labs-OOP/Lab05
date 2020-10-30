package com.letters;

public class I extends H {
    public String i;

    public I(String str) {
        super();
        this.i = str;
    }

    public I() {
        this.i = "i";
    }

    @Override
    public String toString() {
        return super.toString() + "\nI{" +
                "i='" + i + '\'' +
                '}';
    }
}
