package org.liabri.perit.blocks;

import net.minecraft.block.BlockState;

public class WallBlock extends net.minecraft.block.WallBlock {
    private BlockState baseBlockState;

    public WallBlock(BlockState baseBlockState, Settings settings) {
        super(settings);
        this.baseBlockState = baseBlockState;
    }

    public BlockState getBaseBlockState() {
        return this.baseBlockState;
    }
}
