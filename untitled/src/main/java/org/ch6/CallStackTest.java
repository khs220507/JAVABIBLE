package org.ch6;

public class CallStackTest {
    public static void main(String[] args) {
        firstMethod(); // static 메서드에서는 객체 생성없이 호출가능하다.
    }
    static void firstMethod(){
        secondMethod();
    }

    static void secondMethod(){
        System.out.println("secondMethod()");
    }
}

