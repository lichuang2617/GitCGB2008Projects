package com.cy.java.basic;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println(args[0]);

        List<byte[]> list=new ArrayList<>();
        for (int i = 0; i <100 ; i++) {
            list.add(new byte[1024*1024]);
        }
    }
}
