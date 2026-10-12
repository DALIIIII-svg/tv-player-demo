package com.example.tv.network;

public class NetworkConfig {
    private final int connectTimeoutMs;

    public NetworkConfig(int connectTimeoutMs) {
        this.connectTimeoutMs = connectTimeoutMs;
    }

    public static NetworkConfig defaults() {
        return new NetworkConfig(10000);
    }

    public int getConnectTimeoutMs() { return connectTimeoutMs; }
}
