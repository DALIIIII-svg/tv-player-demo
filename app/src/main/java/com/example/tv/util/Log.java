package com.example.tv.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/** Minimal stand-in for android.util.Log, printing in logcat "threadtime" format. */
public final class Log {
    private static final DateTimeFormatter FMT = DateTimeFormatter.ofPattern("MM-dd HH:mm:ss.SSS");
    private static final int PID = 2410;
    private static final int TID = 2410; // thread principal (main) : TID == PID

    private Log() {}

    public static void i(String tag, String msg) { print('I', tag, msg); }
    public static void w(String tag, String msg) { print('W', tag, msg); }
    public static void e(String tag, String msg) { print('E', tag, msg); }

    private static void print(char level, String tag, String msg) {
        System.out.printf("%s %5d %5d %c %s: %s%n",
                LocalDateTime.now().format(FMT), PID, TID, level, tag, msg);
    }
}
