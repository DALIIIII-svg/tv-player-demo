package com.example.tv.network;

/** Tiny test suite (no JUnit needed): run with `java com.example.tv.network.NetworkClientTest`. */
public class NetworkClientTest {
    public static void main(String[] args) {
        connectsOnFastNetwork();
        connectsOnSlowNetwork();
        System.out.println("All tests passed");
    }

    static void connectsOnFastNetwork() {
        NetworkClient client = new NetworkClient(NetworkConfig.defaults());
        check(client.connect(300), "expected connection to succeed with 300ms latency");
    }

    static void connectsOnSlowNetwork() {
        NetworkClient client = new NetworkClient(NetworkConfig.defaults());
        check(client.connect(3000), "expected connection to succeed with 3000ms latency (slow Wi-Fi profile)");
    }

    static void check(boolean condition, String message) {
        if (!condition) {
            throw new AssertionError(message);
        }
    }
}
