package com.marie.rankedapi;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class MCSRRankedAPI {
    public static final String endpoint = "https://api.mcsrranked.com/";
    protected static final HttpClient client = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_1_1)
            .followRedirects(HttpClient.Redirect.NORMAL)
            .connectTimeout(Duration.ofSeconds(20))
            .build();

    public static void main(String[] args) throws IOException, InterruptedException {
        UserProfile profile;
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(MCSRRankedAPI.endpoint + "users/" + "marieeee_"))
                .GET()
                .build();
        HttpResponse<String> response = MCSRRankedAPI.client.send(request, HttpResponse.BodyHandlers.ofString());
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Response response1 = gson.fromJson(response.body(), Response.class);
        profile = gson.fromJson(response1.getData(), UserProfile.class);
        System.out.println(profile.toString());
    }
}
