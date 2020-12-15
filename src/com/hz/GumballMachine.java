package com.hz;

import com.hz.states.gumballmachine.HasQuarter;
import com.hz.states.gumballmachine.NoQuarter;
import com.hz.states.gumballmachine.State;

public class GumballMachine {

    private int count = 0;
    private State state;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = new NoQuarter(this);
        }
    }

    public void insertQuarter() {
        System.out.println(state.insertQuarter());
    }

    public void ejectQuarter() {
        System.out.println(state.ejectQuarter());
    }

    public void turnCrank() {
        boolean toDispense = this.state instanceof HasQuarter;

        System.out.println(state.turnCrank());

        if (toDispense) {
            dispense();
        }
    }

    private void dispense() {
        System.out.println(state.dispense());
    }

    public void refill(int numGumBalls) {
        this.count = numGumBalls;
        this.state = new NoQuarter(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return this.count;
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004\n");
        result.append("Inventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\nMachine is ");
        result.append(state.toString());
        result.append("\n");
        return result.toString();
    }
}
