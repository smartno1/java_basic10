package com.spring.oop.basic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DogTest {
    // 테스트 이름은 단언(Assertion)을 사용한다.
    @Test
    @DisplayName("강아지는 정확하게 만들어져야 한다.")
    void createTest() {

//        new Dog().bite(target);   // Dog에 커서 놓은상태에서 Ctrl+Alt+v 이 찾은항목만 변경 이름변경하고 엔터

        Dog poppy = new Dog("뽀삐", "시츄");

        poppy.introduce();
        poppy.bite("저녀석");


        Dog happy = new Dog("해피", "푸들");

        happy.introduce();
        happy.bite("저녀석");
    }
}