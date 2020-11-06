package com.company;
import com.letters.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Object> letters = new ArrayList<Object>();

        letters.add(new A());
        letters.add(new B());
        letters.add(new C());
        letters.add(new D());
        letters.add(new E());
        letters.add(new F());
        letters.add(new G());
        letters.add(new H());
        letters.add(new I());
        letters.add(new J());

        for (Object letter:
             letters) {
            System.out.println(letter.toString());
            System.out.println(" ------------------------------------- ");
        }

    }
}
