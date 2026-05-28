package net.withrage.uncraftablenomore;

import org.slf4j.Logger;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(UncraftableNoMore.MODID)
public class UncraftableNoMore {
    public static final String MODID = "uncraftablenomore";
    public static final Logger LOGGER = LogUtils.getLogger();

    public UncraftableNoMore(IEventBus modEventBus, ModContainer modContainer) {
        NeoForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("Mod Uncraftable No More is loaded on the server!");
    }
}
