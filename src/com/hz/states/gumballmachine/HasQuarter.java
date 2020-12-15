package com.hz.states.gumballmachine;

import com.hz.GumballMachine;

public class HasQuarter extends State {
    public HasQuarter(GumballMachine machine) {
        super(machine);
    }

    public String insertQuarter() {
        return "You can't insert another quarter.";
    }

    public String ejectQuarter() {
        machine.setState(new NoQuarter(this.machine));
        return "Quarter returned.";
    }

    public String turnCrank() {
        machine.setState(new Sold(this.machine));
        return "You turned...";
    }

    public String dispense() {
        return "No gumball dispensed.";
    }

    @Override
    public String toString() { return "waiting for turn of crank"; }
}
