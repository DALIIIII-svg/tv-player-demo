package com.example.tv.network;

public class NetworkSettings {
    private final int connectTimeoutMs;

    public NetworkSettings(int connectTimeoutMs) {
        this.connectTimeoutMs = connectTimeoutMs;
    }

    public static NetworkSettings defaults() {
        return new NetworkSettings(10000);
    }

    public int getConnectTimeoutMs() { return connectTimeoutMs; }
}
