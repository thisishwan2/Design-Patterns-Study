package com.example.designpatternsstudy._1_singleton;

public class SettingsEagerInitialization {
    private static SettingsEagerInitialization instance = new SettingsEagerInitialization(); // 클래스 로딩 시점에 인스턴스 생성

    private SettingsEagerInitialization(){} // 외부에서 기본 생성자의 접근을 막음

    public static SettingsEagerInitialization getInstance(){
        return instance;
    }
}

class ClientEagerInitialization {
    public static void main(String[] args) {
        SettingsEagerInitialization settingsEagerInitialization1 = SettingsEagerInitialization.getInstance();
        SettingsEagerInitialization settingsEagerInitialization2 = SettingsEagerInitialization.getInstance();
        System.out.println(settingsEagerInitialization1 == settingsEagerInitialization2); // true
    }
}
