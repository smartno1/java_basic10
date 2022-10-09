package com.spring.oop.poly;

public class Basic {
    // Alt + Insert키 ==> 자주씀.
    // Ctrl + Alt + L ==> 들여쓰기 자동으로 잡아줌.

    class A {
    }

    class B extends A {
    }

    class C extends A {
    }

    class D extends B {
    }

    class E extends C {
    }


    public Basic() {

        A a = new A();
        Object a1 = a;

        B b = new B();
        a = b;

        B d = new D();

        // 자식타입은 부모타입에 대입 가능.
        // 부모는 자식타입에 대입 불가.


    }
}
