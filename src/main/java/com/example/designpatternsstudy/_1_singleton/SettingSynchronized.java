package com.example.designpatternsstudy._1_singleton;

public class SettingSynchronized {
    private static SettingSynchronized instance; // 외부에서 접근할 수 없고, 단 하나만 존재하는 인스턴스 객체

    private SettingSynchronized(){}

    public static synchronized SettingSynchronized getInstance(){ // synchronized 키워드를 통해 동기화 처리
        if(instance == null){
            instance = new SettingSynchronized();
        }
        return instance;
    }
}

class ClientSynchronized {
    public static void main(String[] args) {
        SettingSynchronized settingSynchronized1 = SettingSynchronized.getInstance();
        SettingSynchronized settingSynchronized2 = SettingSynchronized.getInstance();
        System.out.println(settingSynchronized1 == settingSynchronized2); // true
    }
}
