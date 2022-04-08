package com.company;

public class Ready extends State implements Switchable{

    @Override
    public Running switchState() {
        return new Running();
    }
}
