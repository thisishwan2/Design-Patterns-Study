package com.example.designpatternsstudy._5_adapter;

// Adapter - Target 인터페이스 구현 (라이트닝 포트에 이어폰 동작 추가)
public class EarphoneAdapter implements LighteningPort{
    private Earphone earphone;

    public EarphoneAdapter(Earphone earphone) {
        this.earphone = earphone;
    }

    @Override
    public void operation() {
        // 전달받은 Adaptee 구현 객체의 playMusic() 호출
        earphone.playMusic();
    }
}
