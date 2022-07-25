package org.liabri.perit.materials;

import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;

import java.util.Arrays;
import java.util.List;

public abstract class Material {
    final String NAME;
    final List<Kinds> LIST;
    final Block BASE;
    final ItemGroup ITEM_GROUP;
    final boolean WHITELIST;

    public abstract void register();

    public Material(String name, Block block, ItemGroup ITEM_GROUP, boolean whitelist, Kinds[] list) {
        this.NAME = name;
        this.LIST = Arrays.asList(list);
        this.BASE = block;
        this.ITEM_GROUP = ITEM_GROUP;
        this.WHITELIST = whitelist;

        register();
    }

    public interface Kinds {}
}
