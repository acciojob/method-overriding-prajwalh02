package com.driver;

import java.sql.SQLOutput;
public class Main {

    public static class A {     //if you creaet a one class inside another class then you have to declare as static
        public String meth() {
            return "Invoking method from class A";
        }
    }
    public static class B extends A {
        @Override
        public String meth() {
            return "Method is overridden in Extendend class B";
        }
    }

    public static void main(String[] args) {
        B b = new B();
        b.meth();

        B b1 = new B();
        b1.meth();
    }
}