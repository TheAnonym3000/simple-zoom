package xyz.anonym.simple_zoom.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Simple_zoomClient implements ClientModInitializer {
    public static final String MOD_ID = "simple-zoom";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public  static KeyBinding keyBinding;

    @Override
    public void onInitializeClient() {
        LOGGER.info("Let it be zoomy! (and more readable (the signs))");
        keyBinding = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.simple-zoom.zoom",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_Z,
                "category.simple-zoom"
        ));
        ClientTickEvents.END_CLIENT_TICK.register( client -> {
            while (keyBinding.wasPressed()) {
                //TODO
                LOGGER.info("pressed zoom key");
            }
        });
    }

}
