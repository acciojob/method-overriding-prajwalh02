package com.driver;

import java.sql.SQLOutput;

class A {
    String meth() {
        return "Invoking method from class A";
    }
}
class B extends A {
    @Override
    String meth() {
        return "Method is overridden in Extendend class B";
    }
}
public class Main {
    public static void main(String[] args) {
        B objB = new B();
        System.out.println(objB.meth());
    }
}