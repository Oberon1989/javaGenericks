package com.Oberon1989;

import com.Oberon1989.collections.GenList;

public class Main {

    public static void main(String[] args) {
        GenList<String> t = new GenList<>(String.class,10);
        for (int i = 0; i < 100; i++) {
            t.add(i+1+"");
        }
        System.out.println(t);
        t.sort();
        System.out.println(t);
        System.out.println(t.indexOf("100"));
    }


}
