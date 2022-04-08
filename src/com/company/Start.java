package com.company;

public class Start extends State implements Switchable{

    @Override
    public Ready switchState() {
        return new Ready();
    }
}
