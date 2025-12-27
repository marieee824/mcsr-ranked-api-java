package com.marie.rankedapi.objects;

import com.marie.rankedapi.MCSRRankedAPI;
import com.marie.rankedapi.Response;
import com.marie.rankedapi.fields.Statistics;
import com.marie.rankedapi.fields.Timestamp;
import com.sun.net.httpserver.Headers;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static com.marie.rankedapi.MCSRRankedAPI.gson;

public class UserProfile {
    private String uuid;
    private String nickname;
    private int roleType;
    private int eloRate;
    private int eloRank;
    private Achievement achievements;
    private Timestamp timestamp;
    private Statistics statistics;
    private String country;

    public MatchInfo[] getUserMatches(Headers headers) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(MCSRRankedAPI.endpoint + "users/" + this.nickname + "/matches"))
                .headers(headers.toString())
                .GET()
                .build();
        HttpResponse<String> httpResponse = MCSRRankedAPI.client.send(request, HttpResponse.BodyHandlers.ofString());
        Response response = gson.fromJson(httpResponse.body(), Response.class);
        System.out.println(response.getData());
        return gson.fromJson(response.getData(), MatchInfo[].class);
    }

    public MatchInfo[] getUserMatches() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(MCSRRankedAPI.endpoint + "users/" + this.nickname + "/matches?count=1"))
                .GET()
                .build();
        HttpResponse<String> httpResponse = MCSRRankedAPI.client.send(request, HttpResponse.BodyHandlers.ofString());
        Response response = gson.fromJson(httpResponse.body(), Response.class);
        System.out.println(response.getData());
        return gson.fromJson(response.getData(), MatchInfo[].class);
    }

    public static UserProfile createUserProfile(String identifier) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(MCSRRankedAPI.endpoint + "users/" + identifier))
                .GET()
                .build();
        HttpResponse<String> httpResponse = MCSRRankedAPI.client.send(request, HttpResponse.BodyHandlers.ofString());
        Response response = gson.fromJson(httpResponse.body(), Response.class);
        return gson.fromJson(response.getData(), UserProfile.class);
    }

    public String getUuid() {
        return this.uuid;
    }

    public String getNickname() {
        return this.nickname;
    }

    public int getRoleType() {
        return this.roleType;
    }

    public int getEloRate() {
        return this.eloRate;
    }

    public int getEloRank() {
        return this.eloRank;
    }

    public Achievement getAchievements() {
        return this.achievements;
    }

    public String getCountry() {
        return this.country;
    }

    @Override
    public String toString() {
        return "UserProfile{" +
                "uuid='" + this.uuid + '\'' +
                ", nickname='" + this.nickname + '\'' +
                ", roleType=" + this.roleType +
                ", eloRate=" + this.eloRate +
                ", eloRank=" + this.eloRank +
                ", achievements=" + this.achievements +
                ", country='" + this.country + '\'' +
                '}';
    }
}
