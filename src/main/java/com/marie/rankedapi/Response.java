package com.marie.rankedapi;

public class Response {
    private String status;
    private Object data;

    public Response(String status, String data) {
        this.status = status;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public String getData() {
        return data.toString();
    }
}
