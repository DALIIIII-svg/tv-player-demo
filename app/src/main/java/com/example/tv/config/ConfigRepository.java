package com.example.tv.config;

import com.example.tv.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class ConfigRepository {
    private static final String TAG = "ConfigRepository";
    private final File configFile;

    public ConfigRepository(File configFile) {
        this.configFile = configFile;
    }

    /** Loads the player configuration. Returns null when no configuration is available. */
    public Config load() {
        if (!configFile.exists()) {
            Log.w(TAG, "No configuration available at " + configFile.getPath());
            return null;
        }
        try {
            List<String> lines = Files.readAllLines(configFile.toPath());
            return new Config(lines.get(0).trim(), Integer.parseInt(lines.get(1).trim()));
        } catch (IOException e) {
            Log.e(TAG, "Unable to read configuration: " + e.getMessage());
            return null;
        }
    }
}
