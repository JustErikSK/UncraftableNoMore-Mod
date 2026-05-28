package net.withrage.uncraftablenomore;

import com.mojang.logging.LogUtils;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;


@Mod(UncraftableNoMore.MODID)
public class UncraftableNoMore {
   public static final String MODID = "uncraftablenomore";
   private static final Logger LOGGER = LogUtils.getLogger();

   public UncraftableNoMore(FMLJavaModLoadingContext context) {
       BusGroup modEventBus = context.getModBusGroup();

       ServerStartingEvent.BUS.addListener(this::onServerStarting);
   }

   private void onServerStarting(ServerStartingEvent event) {
       LOGGER.info("Mod Uncraftable No More is loaded!");
   }
}
