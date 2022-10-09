package com.spring.oop.poly;

import java.lang.invoke.SwitchPoint;

public class Driver {

    public Driver() {
//        drive(new Sonata()); // 소나타, 아반떼, 그랜져 다 가능.

        Car car = buyCar(4000);
//        if (car != null) car.run(); // 주체인 car이 null이면 널익셉션이 터짐, ==> 항상 null체크를 해야한다.
    }

    void drive(Car c) { // Car 타입
        c.run();
    }

    Car buyCar(int money) {
        if (money == 3000) {
            return new Sonata();
        } else if (money == 2000) {
            return new Avante();
        } else if (money == 4000) {
            return new Granduer();
        } else {
            return null;
        }
    }


}
