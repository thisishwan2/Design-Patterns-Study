package com.example.designpatternsstudy._1_singleton;

public class SettingDoubleCheckedLocking {
    private static volatile SettingDoubleCheckedLocking instance; // volatile 키워드를 통해 멀티스레드 환경에서의 가시성 보장

    private SettingDoubleCheckedLocking(){} // 외부에서 기본 생성자의 접근을 막음

    public static SettingDoubleCheckedLocking getInstance(){
        if(instance == null){ // 블록 진입전 인스턴스 확인
            synchronized (SettingDoubleCheckedLocking.class){ // synchronized 키워드를 통해 동기화 처리
                if(instance == null){ // 진입 후 인스턴스 확인
                    instance = new SettingDoubleCheckedLocking();
                }
            }
        }
        return instance;
    }
}

class ClientDoubleCheckedLocking {
    public static void main(String[] args) {
        SettingDoubleCheckedLocking settingDoubleCheckedLocking1 = SettingDoubleCheckedLocking.getInstance();
        SettingDoubleCheckedLocking settingDoubleCheckedLocking2 = SettingDoubleCheckedLocking.getInstance();
        System.out.println(settingDoubleCheckedLocking1 == settingDoubleCheckedLocking2); // true
    }
}
