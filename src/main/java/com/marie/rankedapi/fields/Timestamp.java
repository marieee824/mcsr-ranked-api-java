package com.marie.rankedapi.fields;

public class Timestamp {
    private final int firstOnline;
    private final int lastOnline;
    private final int lastRanked;
    private final int nextDecay;

    public Timestamp(int firstOnline, int lastOnline, int lastRanked, int nextDecay) {
        this.firstOnline = firstOnline;
        this.lastOnline = lastOnline;
        this.lastRanked = lastRanked;
        this.nextDecay = nextDecay;
    }

    public int getFirstOnline() {
        return this.firstOnline;
    }

    public int getLastOnline() {
        return this.lastOnline;
    }

    public int getLastRanked() {
        return this.lastRanked;
    }

    public int getNextDecay() {
        return this.nextDecay;
    }
}
