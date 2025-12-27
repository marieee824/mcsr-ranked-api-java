package com.marie.rankedapi;

import java.io.IOException;

public class UserProfile {
    private String uuid;
    private String nickname;
    private int roleType;
    private int eloRate;
    private int eloRank;
    private Achievement[] achievements;
    private String country;

    public UserProfile(String identifier) throws IOException, InterruptedException {

    }

    @Override
    public String toString() {
        return "UserProfile{" +
                "uuid='" + uuid + '\'' +
                ", nickname='" + nickname + '\'' +
                ", roleType=" + roleType +
                ", elo=" + eloRate +
                ", rank=" + eloRank +
                ", country='" + country + '\'' +
                '}';
    }
}
