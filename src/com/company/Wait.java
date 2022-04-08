package com.company;

public class Wait extends State implements Switchable{

    @Override
    public Ready switchState() {
        return new Ready();
    }
}
