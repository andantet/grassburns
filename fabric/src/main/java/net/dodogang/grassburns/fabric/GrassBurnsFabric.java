package net.dodogang.grassburns.fabric;

import net.dodogang.grassburns.GrassBurns;
import net.fabricmc.api.ModInitializer;

public class GrassBurnsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        GrassBurns.initialize();
    }
}
