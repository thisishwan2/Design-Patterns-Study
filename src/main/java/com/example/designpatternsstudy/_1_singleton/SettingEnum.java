package com.example.designpatternsstudy._1_singleton;

import java.io.*;

public enum SettingEnum { // 리플랙션 대응 방법 = Enum
    INSTANCE,

    SettingEnum(){}; // enum은 기본 생성자가 private

    private Integer number;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}

class ClientEnum{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SettingEnum settings = SettingEnum.INSTANCE;
        SettingEnum settings1 = null;
        try (
                ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings);
        }

        try (
                ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings1 = (SettingEnum) in.readObject();
        }

        System.out.println(settings == settings1);	// true
    }
}
