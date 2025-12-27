package com.marie.rankedapi.objects;

import java.util.Arrays;

public class MatchSeed {
    private String id;
    private String overworld;
    private String bastion;
    private int[] endTowers;
    private String[] variations;

    @Override
    public String toString() {
        return "MatchSeed{" +
                "id='" + id + '\'' +
                ", overworld='" + overworld + '\'' +
                ", bastion='" + bastion + '\'' +
                ", endTowers=" + Arrays.toString(endTowers) +
                ", variations=" + Arrays.toString(variations) +
                '}';
    }
}
