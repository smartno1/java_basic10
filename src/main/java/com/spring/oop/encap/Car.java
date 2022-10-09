package com.spring.oop.encap;

public class Car {
    final String model;   // 모델명 // final : 초기값이후 변경 불가
    private int currentSpeed;   // 현재 속도
    private int limitSpeed; // 최대 제한 속도

    public Car(String model, int limitSpeed) { // 초기값을 알 수 없을때 받아서.
        this.model = model;
//        this.currentSpeed = 0;            // 초기값을 아는 것은 안받고 초기화.
        this.limitSpeed = limitSpeed;
    }

    // 시동켜기

    public void on() {
        injectOil();
        injectGas();
        moveCylinder();
        powerOn();
    }

    private void powerOn() {
        System.out.println("시동 버튼을 눌렀습니다.");
    }
    private void injectOil() {
        System.out.println("엔진오일을 분사합니다.");
    }
    private void injectGas() {
        System.out.println("가솔린을 분사합니다.");
    }
    private void moveCylinder() {
        System.out.println("실린더를 작동합니다.");
    }

    // 속도를 올리는 기능
    public void accelerator() {
        System.out.println("악셀을 밟았습니다.");
        if (this.currentSpeed >= 300) {
            System.out.println("이제 못밟습니다~~");
            return;
        }
        this.currentSpeed += 50;
        System.out.println("현재속도: " + currentSpeed);
    }
}
