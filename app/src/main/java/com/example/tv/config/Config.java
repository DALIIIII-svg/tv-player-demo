package com.example.tv.config;

public class Config {
    private final String url;
    private final int bufferMs;

    public Config(String url, int bufferMs) {
        this.url = url;
        this.bufferMs = bufferMs;
    }

    /** Configuration used when no configuration file is available on the device. */
    public static Config defaultConfig() {
        return new Config("https://cdn.example.tv/default/manifest.mpd", 2000);
    }

    public String getUrl() { return url; }
    public int getBufferMs() { return bufferMs; }
}
