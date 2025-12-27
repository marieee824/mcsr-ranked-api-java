package com.marie.rankedapi.fields;

public class Statistic {
    private final int ranked;
    private final int casual;

    public Statistic(int ranked, int casual) {
        this.ranked = ranked;
        this.casual = casual;
    }

    public int getRanked() {
        return this.ranked;
    }

    public int getCasual() {
        return this.casual;
    }

    @Override
    public String toString() {
        return "Statistic{" +
                "ranked=" + this.ranked +
                ", casual=" + this.casual +
                '}';
    }
}
