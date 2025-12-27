package com.marie.rankedapi.fields;

public class Statistics {
    private final Statistic season;
    private final Statistic total;

    public Statistics(Statistic season, Statistic total) {
        this.season = season;
        this.total = total;
    }

    public Statistic getSeason() {
        return this.season;
    }

    public Statistic getTotal() {
        return this.total;
    }

    @Override
    public String toString() {
        return "Statistics{" +
                "season=" + this.season +
                ", total=" + this.total +
                '}';
    }
}
