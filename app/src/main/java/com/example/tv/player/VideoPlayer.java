package com.example.tv.player;

import com.example.tv.util.Log;

public class VideoPlayer {
    private static final String TAG = "VideoPlayer";
    private String url;

    public void initialize(String url, int bufferMs) {
        this.url = url;
        Log.i(TAG, "Initializing player: url=" + url + ", bufferMs=" + bufferMs);
    }

    public void play() {
        Log.i(TAG, "Playback started: " + url);
    }
}
