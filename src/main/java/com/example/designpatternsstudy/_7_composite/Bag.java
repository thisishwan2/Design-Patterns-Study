package com.example.designpatternsstudy._7_composite;

import java.util.ArrayList;
import java.util.List;

public class Bag implements ItemComponent{
    // 가방에 서브 가방과 아이템을 넣는다. 이때 인터페이스 타입으로 관리
    List<ItemComponent> components = new ArrayList<>();

    String name; // 가방 이름

    public Bag(String name){
        this.name = name;
    }

    // 리스트에 아이템 및 가방 추가
    public void add(ItemComponent things){
        components.add(things);
    }

    // 현재 가방의 내용물 반환
    public List<ItemComponent> getComponents(){
        return components;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        int sum = 0;
        for (ItemComponent component : components) {
            sum+=component.getPrice();
        }

        return sum;
    }
}
