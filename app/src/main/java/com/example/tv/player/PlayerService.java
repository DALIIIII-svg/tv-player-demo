package com.example.tv.player;

import com.example.tv.config.Config;
import com.example.tv.config.ConfigRepository;
import com.example.tv.util.Log;

public class PlayerService {
    private static final String TAG = "PlayerService";
    private final ConfigRepository configRepository;
    private final VideoPlayer player;

    public PlayerService(ConfigRepository configRepository, VideoPlayer player) {
        this.configRepository = configRepository;
        this.player = player;
    }

    public void start() {
        Log.i(TAG, "Starting playback");
        Config config = loadConfig();
        player.initialize(config.getUrl(), config.getBufferMs());
        player.play();
    }

    private Config loadConfig() {
        Config config = configRepository.load();
        Log.i(TAG, "Configuration loaded");
        return config;
    }
}
