package org.liabri.perit.renderers;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import org.liabri.perit.blocks.Blocks;

import java.util.Objects;

import static org.liabri.perit.Perit.id;

public class Renderers {
    public static void init() {}

    static {
        for (Block block : Blocks.blocks) {
            if (Objects.equals(block.getLootTableId().getPath(), "blocks/stripped_bamboo_door")) {
                BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());
            }
        }
    }
}
