package org.liabri.perit;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.liabri.perit.renderers.Renderers;

@Environment(EnvType.CLIENT)
public class PeritClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        Renderers.init();
    }
}
