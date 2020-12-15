package com.hz.states.gumballmachine;

import com.hz.GumballMachine;

public class HasQuarterState extends State {
    public HasQuarterState(GumballMachine machine) {
        super(machine);
    }

    public String insertQuarter() {
        return "You can't insert another quarter.";
    }

    public String ejectQuarter() {
        machine.setState(new NoQuarterState(this.machine));
        return "Quarter returned.";
    }

    public String turnCrank() {
        machine.setState(new SoldState(this.machine));
        return "You turned...";
    }

    public String dispense() {
        return "No gumball dispensed.";
    }

    @Override
    public String toString() { return "waiting for turn of crank"; }
}
