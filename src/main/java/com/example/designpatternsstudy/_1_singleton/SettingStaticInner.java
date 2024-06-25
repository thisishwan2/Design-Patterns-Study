package com.example.designpatternsstudy._1_singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SettingStaticInner {
    private SettingStaticInner(){} // 외부에서 기본 생성자의 접근을 막음

    private static class SettingStaticInnerHolder{ // inner 클래스를 이용하여 getInstance() 호출 시에만 인스턴스 생성(lazy initialization)
        private static final SettingStaticInner instance = new SettingStaticInner();
    }

    public static SettingStaticInner getInstance(){
        return SettingStaticInnerHolder.instance;
    }
}

class ClientStaticInner {
    public static void main(String[] args) {
        SettingStaticInner settingStaticInner1 = SettingStaticInner.getInstance();
        SettingStaticInner settingStaticInner2 = SettingStaticInner.getInstance();
        System.out.println(settingStaticInner1 == settingStaticInner2); // true
    }
}

class ClientUsingReflectionToBrakeSingleton{ // 리플렉션을 이용하여 싱글톤을 깨는 예제
    // 리플렉션으로 생성자를 가져와, 접근제어자에 대한 설정을 변경한 뒤, 새로운 객체를 생성하는 방식
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        SettingStaticInner instance = SettingStaticInner.getInstance(); // 싱글톤 인스턴스 생성
        Constructor<SettingStaticInner> declaredConstructor = SettingStaticInner.class.getDeclaredConstructor(); // 해당 클래스의 생성자 객체를 가져온다.
        declaredConstructor.setAccessible(true); // 해당 객체의 private 접근제어자를 무시한다.

        SettingStaticInner settingStaticInner = declaredConstructor.newInstance(); // 생성자를 사용하여 새 인스턴스 생성

        System.out.println(instance == settingStaticInner); // false, 싱글톤 깨짐
    }
}