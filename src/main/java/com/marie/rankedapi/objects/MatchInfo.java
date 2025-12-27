package com.marie.rankedapi.objects;

import com.marie.rankedapi.fields.Change;
import com.marie.rankedapi.fields.Result;
import com.marie.rankedapi.fields.VOD;

import java.util.Arrays;

public class MatchInfo {
    public static final int CASUAL = 1;
    public static final int RANKED = 2;
    public static final int PRIVATE_ROOM = 3;
    public static final int EVENT = 4;

    private String id;
    private int type;
    private int season;
    private String category;
    private int date;
    private UserProfile[] players;
    private UserProfile[] spectators;
    private MatchSeed seed;
    private Result result;
    private boolean forfeited;
    private boolean decayed;
    private int seasonRank;
    private int allTimeRank;
    private Change[] changes;
    private String tag;
    private boolean beginner;
    private String[] vod;

    @Override
    public String toString() {
        return "MatchInfo{" +
                "id='" + id + '\'' +
                ", type=" + type +
                ", season=" + season +
                ", category='" + category + '\'' +
                ", date=" + date +
                ", players=" + Arrays.toString(players) +
                ", spectators=" + Arrays.toString(spectators) +
                ", seed=" + seed +
                ", result=" + result +
                ", forfeited=" + forfeited +
                ", decayed=" + decayed +
                ", seasonRank=" + seasonRank +
                ", allTimeRank=" + allTimeRank +
                ", changes=" + Arrays.toString(changes) +
                ", tag='" + tag + '\'' +
                ", beginner=" + beginner +
                ", vod=" + Arrays.toString(vod) +
                '}';
    }
}
