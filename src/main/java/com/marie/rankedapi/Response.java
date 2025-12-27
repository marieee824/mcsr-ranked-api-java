package com.marie.rankedapi;

public class Response {
    private final String status;
    private final Object data;

    public Response(String status, String data) {
        this.status = status;
        this.data = data;
    }

    public String getStatus() {
        return this.status;
    }

    public String getData() {
        return this.data.toString();
    }
}
