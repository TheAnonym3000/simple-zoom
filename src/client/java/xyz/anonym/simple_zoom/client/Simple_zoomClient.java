package xyz.anonym.simple_zoom.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents;
import net.minecraft.text.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Simple_zoomClient implements ClientModInitializer {
    public static final String MOD_ID = "simple-zoom";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitializeClient() {
        LOGGER.info("Let it be zoomy! (and more readable (the signs))");

    }

}
