package com.hz.states.gumballmachine;

import com.hz.GumballMachine;

public abstract class State {
    GumballMachine machine;

    State(GumballMachine machine) {
        this.machine = machine;
    }

    public abstract String insertQuarter();
    public abstract String ejectQuarter();
    public abstract String turnCrank();
    public abstract String dispense();
    public abstract String toString();
}
