package org.liabri.perit.blocks;

import net.minecraft.block.BlockState;

public class WallBlock extends net.minecraft.block.WallBlock {
    private BlockState baseBlockState;
    private String textureName;

    public WallBlock(BlockState baseBlockState, Settings settings) {
        super(settings);
        this.baseBlockState = baseBlockState;
    }
    public WallBlock(BlockState baseBlockState, String textureName, Settings settings) {
        super(settings);
        this.textureName = textureName;
        this.baseBlockState = baseBlockState;
    }

    public BlockState getBaseBlockState() {
        return this.baseBlockState;
    }

    public String getTextureName() { return this.textureName; }
}
