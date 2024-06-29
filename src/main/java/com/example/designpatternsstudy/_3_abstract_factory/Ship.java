package com.example.designpatternsstudy._3_abstract_factory;

import lombok.Data;

@Data
public class Ship {
    private String name;
    private String email;
    private String logo;

    // 부품
    private Anchor anchor;
    private Engine engine;

}



