package net.dodogang.grassburns;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GrassBurns {
    public static final String MOD_ID = "grassburns";
    public static final String MOD_NAME = "Example Mod";

    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public static void initialize() {
        log("Initializing");

        //

        log("Initialized");
    }

    public static void log(Level level, String message) {
        LOGGER.log(level, "[{}] {}", MOD_NAME, message);
    }
    public static void log(String message) {
        GrassBurns.log(Level.INFO, message);
    }
}
