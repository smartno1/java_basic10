package com.spring.oop.poly;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DriverTest {

    @Test
    void dTest() {

        Driver d = new Driver();

        Avante car = (Avante) d.buyCar(2000);

        car.run();
        car.nMode();
        // nMode()는 Car의 자식 Avante에서 새롭게 생성된 메서드로 업캐스팅(자식을 부모타입에 대입)을 하면 자식에서 새로 생긴 것은 참조 할 수 없다.
        // ==> buyCar의 리턴타입이 Car 이므로 다운캐스팅 (Avante)을 하고 Avante 타입으로 받으면 Avante 에서 새로 만든 것에 접근 할 수 있다.

    }

}