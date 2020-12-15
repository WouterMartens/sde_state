package com.hz.states.gumballmachine;

import com.hz.GumballMachine;

public class SoldState extends State {
    public SoldState(GumballMachine machine) {
        super(machine);
    }

    public String insertQuarter() {
        return "Please wait, we're already giving you a gumball.";
    }

    public String ejectQuarter() { return "Sorry, you already turned the crank."; }

    public String turnCrank() {
        return "Turning twice doesn't get you another gumball!";
    }

    public String dispense() {
        this.machine.setCount(this.machine.getCount() - 1);
        if (this.machine.getCount() == 0) {
            this.machine.setState(new SoldOutState(this.machine));
            return "You got the last one!";
        } else {
            this.machine.setState(new NoQuarterState(this.machine));
            return "A gumball comes rolling out the slot.";
        }
    }

    @Override
    public String toString() { return "delivering a gumball"; }
}
