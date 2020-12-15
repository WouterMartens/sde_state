package com.hz.states.gumballmachine;

import com.hz.GumballMachine;

public class NoQuarterState extends State {
    public NoQuarterState(GumballMachine machine) {
        super(machine);
    }

    public String insertQuarter() {
        this.machine.setState(new HasQuarterState(this.machine));
        return "You inserted a quarter";
    }

    public String ejectQuarter() {
        return "You haven't inserted a quarter.";
    }

    public String turnCrank() {
        return "You turned but there's no quarter.";
    }

    public String dispense() {
        return "You need to pay first.";
    }

    @Override
    public String toString() { return "waiting for quarter"; }
}
