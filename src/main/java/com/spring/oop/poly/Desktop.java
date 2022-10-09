package com.spring.oop.poly;

import com.spring.oop.inherit.Player;
import com.spring.oop.inherit.Warrior;

public class Desktop {

    Monitor monitor;

    Object[] arr;

    public Desktop() {
        this.monitor = new HpMonitor();
        this.monitor = new LgMonitor();
        // Monitor 는 hp,lg 의 부모타입으로 둘다 대입 가능.

        arr = new Object[] {
                new LgMonitor()
                , new HpMonitor()
                , new Player()
                , ""
                , 30
        };
    }
}
