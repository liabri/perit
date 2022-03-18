package net.fabricmc.example.blocks;

public class WoodenPressurePlateBlock extends net.minecraft.block.PressurePlateBlock {
    public WoodenPressurePlateBlock(Settings settings) {
        super(ActivationRule.EVERYTHING, settings);
    }
}
