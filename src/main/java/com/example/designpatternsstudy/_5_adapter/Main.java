package com.example.designpatternsstudy._5_adapter;

class IPhoneUser {
    private LighteningPort adapter;

    public IPhoneUser() {
        this.adapter = new EarphoneAdapter(new ThreePointFiveEarphone());
    }

    public void listenMusic() {
        adapter.operation();
    }
}

// 메인 메서드 정의
public class Main {
    public static void main(String[] args) {
        IPhoneUser client = new IPhoneUser();
        client.listenMusic();
    }
}
