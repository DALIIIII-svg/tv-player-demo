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
        Config config = configRepository.load();
        if (config == null) {
            Log.i(TAG, "Falling back to default configuration");
            config = Config.defaultConfig();
        }
        player.initialize(config.getUrl(), config.getBufferMs());
        player.play();
    }
}
