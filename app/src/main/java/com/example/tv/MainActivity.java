package com.example.tv;

import com.example.tv.config.ConfigRepository;
import com.example.tv.player.PlayerService;
import com.example.tv.player.VideoPlayer;
import java.io.File;

/** Entry point standing in for the Android TV activity. */
public class MainActivity {
    public static void main(String[] args) {
        File configFile = new File(args.length > 0 ? args[0] : "/data/tv/player.conf");
        PlayerService service = new PlayerService(new ConfigRepository(configFile), new VideoPlayer());
        onPlayClicked(service);
    }

    static void onPlayClicked(PlayerService service) {
        service.start();
    }
}
