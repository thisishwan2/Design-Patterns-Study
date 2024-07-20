package com.example.designpatternsstudy._6_bridge;

public class Main {
    public static void main(String[] args) {
        Champion KDA아리 = new 아리(new KDA_skin());
        KDA아리.move();
        KDA아리.skillQ();

        Champion PoolParty아리 = new 아리(new KDA_skin());
        PoolParty아리.move();
        PoolParty아리.skillR();

    }
}

