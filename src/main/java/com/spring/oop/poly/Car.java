package com.spring.oop.poly;
// Ctrl + D : 커서 있는 줄을 아래로 복사.
class Avante extends Car {

    @Override
    void run() {
        System.out.println("아반떼가 달립니다.");
    }

    @Override
    void brake() {

    }

    void nMode() {
        System.out.println("아반떼가 빠르게 달립니다.");
    }
}
class Sonata extends Car {

    @Override
    void run() {
        System.out.println("소나타가 달립니다.");
    }

    @Override
    void brake() {

    }
}
class Granduer extends Car {

    @Override
    void run() {
        System.out.println("그랜저가 달립니다.");
    }

    @Override
    void brake() {

    }
}

// shiftX2 : 통합검색
// Alt + <- or -> : 탭이동.
// Ctrl + E : 파일목록
public abstract class Car { // 추상 클래스

    abstract void run();    // 추상 메서드 : 자식클래스에서 필히~~!! 완성시켜줘야한다. 오버라이딩 강요.

    abstract void brake();  // 추상 메서드 : 추상 클래스에서만 추상메서드 가능.

}
//public interface class Car {
//    void run();
//    void run();
//}
// 인터페이스는 기본에 추상메서드로 abstract 안붙임.
// 자식들은 extends 대신 implements 사용.
// 자식들에서 메서드 오버라이딩 할 때 public 필요.

