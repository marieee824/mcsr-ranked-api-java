package com.marie.rankedapi.fields;

public class VOD {
    private final String uuid;
    private final String url;
    private final int startsAt;

    public VOD(String uuid, String url, int startsAt) {
        this.uuid = uuid;
        this.url = url;
        this.startsAt = startsAt;
    }

    public String getUuid() {
        return uuid;
    }

    public int getStartsAt() {
        return startsAt;
    }

    public String getUrl() {
        return url;
    }
}
