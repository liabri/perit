package net.fabricmc.example.blocks;

import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.block.PillarBlock;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.Direction;

public class StrippedLogBlock extends PillarBlock {
    public StrippedLogBlock(MapColor topMaterialColor, MapColor sideMaterialColor) {
        super(Settings.of(Material.WOOD, (blockState) -> {
            return blockState.get(PillarBlock.AXIS) == Direction.Axis.Y ? topMaterialColor : sideMaterialColor;
        }).strength(2.0F).sounds(BlockSoundGroup.WOOD));

    }
}
