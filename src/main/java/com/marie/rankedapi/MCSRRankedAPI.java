package com.marie.rankedapi;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.ToNumberPolicy;
import com.marie.rankedapi.objects.MatchInfo;
import com.marie.rankedapi.objects.UserProfile;

import java.io.IOException;
import java.net.http.HttpClient;
import java.time.Duration;
import java.util.Arrays;

public class MCSRRankedAPI {
    public static final String endpoint = "https://api.mcsrranked.com/";
    public static final HttpClient client = HttpClient.newBuilder()
            .connectTimeout(Duration.ofSeconds(20))
            .build();
    public static final Gson gson = new GsonBuilder().setObjectToNumberStrategy(ToNumberPolicy.LAZILY_PARSED_NUMBER).setPrettyPrinting().create();

    public static void main(String[] args) throws IOException, InterruptedException {
        UserProfile profile = UserProfile.createUserProfile("marieeee_");
        System.out.println(Arrays.toString(profile.getUserMatches()));
        String data = "{id:4361680, type:2, seed:{id:\"m7233hk2061ba6xj\", overworld:VILLAGE, nether:STABLES, endTowers:[88.0, 103.0, 79.0, 97.0], variations:[\"biome:structure:plains\", \"biome:structure:plains\", \"bastion:good_gap:1\", \"bastion:triple:1\", \"bastion:single:1\", \"bastion:small_single:1\", \"biome:bastion:warped_forest\", \"biome:fortress:warped_forest\", \"end_tower:caged:back\"]}, category:ANY, gameMode:default, players:[{uuid:\"492267f797cf494c9c4afc84b5a042b7\", nickname:Liang_Yang, roleType:2.0, eloRate:1278.0, eloRank:1394.0, country:cn}, {uuid:\"fc0eba854e504bed9d41f15e4641a2c1\", nickname:marieeee_, roleType:1.0, eloRate:1331.0, eloRank:1131.0, country:us}], spectators:[], result:{uuid:\"fc0eba854e504bed9d41f15e4641a2c1\", time:776713.0}, forfeited:false, decayed:false, rank:{season:null, allTime:null}, vod:[], changes:[{uuid:\"fc0eba854e504bed9d41f15e4641a2c1\", change:20.0, eloRate:1311.0}, {uuid:\"492267f797cf494c9c4afc84b5a042b7\", change:-20.0, eloRate:1318.0}], beginner:false, botSource:null, season:9.0, date:1.766796874E9, seedType:VILLAGE, bastionType:STABLES, tag:null}";
        MatchInfo info = gson.fromJson(data, MatchInfo.class);
        System.out.println(info);
    }
}
