package com.marie.rankedapi.objects;

import java.util.Arrays;

public class Achievement {
    private String id;
    private int date;
    private String[] data;
    private int level;
    private int value;
    private int goal;

    @Override
    public String toString() {
        return "Achievement{" +
                "id='" + id + '\'' +
                ", date=" + date +
                ", data=" + Arrays.toString(data) +
                ", level=" + level +
                ", value=" + value +
                ", goal=" + goal +
                '}';
    }
}