package com.spring.oop.inherit;

public class Warrior extends Player {

    private int rage;

    public Warrior() {
        // 여기에 super();가 숨어있다. super();는 무조건 맨 첫줄에 와야한다.
        System.out.println("Warrior 기본 생정자 호출!");

    }
    public Warrior(String nickName) {
//        super(); // 이게 디폴트로 들어가있다. 안보일뿐. == Player(); 인데 부모에는 디폴트생성자는 없고 String을 받는 생성자만 있으면
        super(nickName);    // String 을 받는 것으로 해줘야 에러가 없다.
        System.out.println("Warrior 생성자 호출!");
        this.rage = 100;
    }
    // 즉, 상속은 자식이 만들어지면서 부모의 기본 생성자를 호출하고 (==> 객체가 2개 만들어짐. 부모, 자식)
    //      자식은 자신의 super 필드에 부모의 필드들,메서드들의 주소를 참조하여 연결해놓는 것. 부모의 것을 자식이 가져와서 넣는것이 아니다.


    @Override   // 오버라이딩이 잘 되었는지 확인해주는 어노테이션. 빨간줄없으면 잘 된 것. ===> 링크가 바뀜 : 부모의메서드를 참조하지않고 아래 작성된 메서드를 참조.
    public void info() { // 은닉수준은 부모보다 낮출 수는 있으나 올릴 수는 없다.  
        super.info();  // 부모의 인포내용을 호출하여 가져오는것.
        System.out.println("# 분노: " + rage);
    }

}
