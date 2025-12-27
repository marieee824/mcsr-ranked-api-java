package com.marie.rankedapi.fields;

public class Result {
    private final String uuid;
    private final int time;

    public Result(String uuid, int time) {
        this.uuid = uuid;
        this.time = time;
    }

    public String getUuid() {
        return this.uuid;
    }

    public int getTime() {
        return this.time;
    }

    @Override
    public String toString() {
        return "Result{" +
                "uuid='" + uuid + '\'' +
                ", time=" + time +
                '}';
    }
}
