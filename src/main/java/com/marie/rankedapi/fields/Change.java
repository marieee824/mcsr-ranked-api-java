package com.marie.rankedapi.fields;

public class Change {
    private final String uuid;
    private final int change;
    private final int eloRate;

    public Change(String uuid, int change, int eloRate) {
        this.uuid = uuid;
        this.change = change;
        this.eloRate = eloRate;
    }

    public String getUuid() {
        return uuid;
    }

    public int getChange() {
        return change;
    }

    public int getEloRate() {
        return eloRate;
    }

    @Override
    public String toString() {
        return "Change{" +
                "uuid='" + uuid + '\'' +
                ", change=" + change +
                ", eloRate=" + eloRate +
                '}';
    }
}
