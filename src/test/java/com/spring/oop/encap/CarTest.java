package com.spring.oop.encap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void carTest() {

        Car car = new Car("포르쉐911", 320);

        car.on();

//        car.accelerator(); ==> accelerator 에 커서두고 Alt + (Enter*2) ==> 아래 루프문으로 바꿔줌.
//        car.accelerator();
//        car.accelerator();
//        car.accelerator();
//        car.accelerator();

        for (int i = 0; i < 10; i++) {
            car.accelerator();
        }


    }

}