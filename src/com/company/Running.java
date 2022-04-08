package com.company;

public class Running extends State implements Switchable {

    @Override
    public Wait switchState() {
        return new Wait();
    }

    public State switchState(boolean isComplete) {
        if (isComplete) {
            return new Terminated();
        } else {
            return switchState();
        }
    }
}
