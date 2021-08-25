package net.dodogang.grassburns.forge;

import net.dodogang.grassburns.GrassBurns;
import net.dodogang.plume.ash.forge.ModEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(GrassBurns.MOD_ID)
public class GrassBurnsForge {
    public GrassBurnsForge() {
        ModEventBus.registerModEventBus(GrassBurns.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        GrassBurns.initialize();
    }
}
