package com.example.designpatternsstudy._1_singleton;

public class SettingsEasy {
    private SettingsEasy(){} // 외부에서 기본 생성자의 접근을 막음

    public static SettingsEasy getInstance(){
        return new SettingsEasy();
    }
}

class Client {
    public static void main(String[] args) {
        SettingsEasy settingsEasy1 = SettingsEasy.getInstance();
        SettingsEasy settingsEasy2 = SettingsEasy.getInstance();
        System.out.println(settingsEasy1 == settingsEasy2); // false
    }
}
