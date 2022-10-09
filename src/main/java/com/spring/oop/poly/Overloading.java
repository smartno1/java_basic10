package com.spring.oop.poly;

public class Overloading {
    // 한 클래스에 같은 이름의 메서드를 여러개 만드는 것.
    // 규칙 : 매개변수가 동일 하지 않으면 됨. 이름이 다르거나, 갯수가 다르거나, 순서가 다르거나 셋중 하나만 만족하면 됨.
    // 메서드의 리턴타입은 같든 다르든 영향 없음.
    void foo() {}
    void foo(int a) {}
    void foo(double b) {}
    void foo(int x, double y) {}
    void foo(double y, int x) {}

    public Overloading() {


    }
}
