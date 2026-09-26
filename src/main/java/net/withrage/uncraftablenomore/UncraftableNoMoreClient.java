package net.withrage.uncraftablenomore;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

@Mod(value = UncraftableNoMore.MODID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = UncraftableNoMore.MODID, value = Dist.CLIENT)
public class UncraftableNoMoreClient {
    public UncraftableNoMoreClient(ModContainer container) {
        container.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
        UncraftableNoMore.LOGGER.info("Mod Uncraftable No More is loaded on the client!");
    }
}
