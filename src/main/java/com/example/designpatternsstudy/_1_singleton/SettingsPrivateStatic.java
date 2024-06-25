package com.example.designpatternsstudy._1_singleton;

public class SettingsPrivateStatic {
    private static SettingsPrivateStatic instance; // 외부에서 접근할 수 없고, 단 하나만 존재하는 인스턴스 객체

    private SettingsPrivateStatic(){}

    public static SettingsPrivateStatic getInstance(){
        if(instance == null){
            instance = new SettingsPrivateStatic();
        }
        return instance;
    }
}

class ClientPrivateStatic {
    public static void main(String[] args) {
        SettingsPrivateStatic settingsPrivateStatic1 = SettingsPrivateStatic.getInstance();
        SettingsPrivateStatic settingsPrivateStatic2 = SettingsPrivateStatic.getInstance();
        System.out.println(settingsPrivateStatic1 == settingsPrivateStatic2); // true
    }
}
