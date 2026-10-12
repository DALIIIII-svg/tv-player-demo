package com.example.tv.network;

import com.example.tv.util.Log;

public class NetworkClient {
    private static final String TAG = "NetworkClient";
    private final NetworkConfig config;

    public NetworkClient(NetworkConfig config) {
        this.config = config;
    }

    /** Simulates a connection whose handshake takes latencyMs milliseconds. */
    public boolean connect(int latencyMs) {
        if (latencyMs > config.getConnectTimeoutMs()) {
            Log.e(TAG, "Connection timed out after " + config.getConnectTimeoutMs() + "ms");
            return false;
        }
        Log.i(TAG, "Connected in " + latencyMs + "ms");
        return true;
    }
}
