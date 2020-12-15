package com.hz.states.gumballmachine;

import com.hz.GumballMachine;

public class SoldOutState extends State {
    public SoldOutState(GumballMachine machine) {
        super(machine);
    }

    public String insertQuarter() {
        return "You can't insert a quarter, the machine is sold out.";
    }

    public String ejectQuarter() { return "You can't eject, you haven't inserted a quarter yet."; }

    public String turnCrank() {
        return "You turned, but there are no gumballs.";
    }

    public String dispense() { return "No gumball dispensed."; }

    @Override
    public String toString() { return "sold out"; }
}
