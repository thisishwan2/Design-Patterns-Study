package com.example.designpatternsstudy._1_singleton;

import java.io.*;

public class SettingsSerializerAndDeSerializer implements Serializable{ // 직렬화를 상속받아야한다.
    private SettingsSerializerAndDeSerializer(){} // 외부에서 기본 생성자의 접근을 막음

    private static class SettingsSerializerAndDeSerializerStaticInnerHolder{ // inner 클래스를 이용하여 getInstance() 호출 시에만 인스턴스 생성(lazy initialization)
        private static final SettingsSerializerAndDeSerializer instance = new SettingsSerializerAndDeSerializer();
    }

    public static SettingsSerializerAndDeSerializer getInstance(){
        return SettingsSerializerAndDeSerializerStaticInnerHolder.instance;
    }

    // 대응 방법
    protected Object readResolve() { // 역직렬화 시 사용
        return getInstance();
    }
}

class ClientSerializerAndDeSerializer {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SettingsSerializerAndDeSerializer setting1 = SettingsSerializerAndDeSerializer.getInstance();
        SettingsSerializerAndDeSerializer setting2 = null;

        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("setting.obj"))) {
            out.writeObject(setting1);
        }

        try (ObjectInput input = new ObjectInputStream(new FileInputStream("setting.obj"))) {
            setting2 = (SettingsSerializerAndDeSerializer) input.readObject();
        }

        System.out.println(setting1 == setting2); // readResolve 구현시 True, 아니면 false
    }
}
