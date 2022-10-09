package com.spring.oop.basic;

public class Dog { // junit 테스트 생성단축키 : 클래스내에 커서두고 Shift+Ctrl+T
    // 클래스 구성요소
    // 1.필드:힙에 저장됨.범위넓음.검색느림.생명주기김.
    String name;
    String kind;
    int age;

    // 2.생성자(함수)
    Dog(String name, String kind) {
        // 위의 것들은 변수:스택에 저장됨.범위좁음.검색빠름.생명주기짧음
        System.out.println("멍멍이 출생신고함!");
        this.name = name;
        this.kind = kind;
        this.age = 1;

//        this.introduce();
    }

    // 3.매서드
    void bite(String target) {
        System.out.printf("%s 멍멍이는 %s를 깨물어요~\n", name, target);
    }
    void introduce() {
        System.out.printf("내 이름은  %s고 나는 %s종이야~~\n", name, kind);
        System.out.printf("나이는 %d세란다 ~~\n", age);
        System.out.println("=======================================");
    }

}
