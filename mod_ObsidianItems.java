package net.minecraft.src;

import java.util.*;

public class mod_ObsidianItems extends BaseMod
{
    public static final Item obsidianBar = new Item(3000).setItemName("ObsidianBar");

    public mod_ObsidianItems()
    {
        // Block registrations

        // Texture overrides
        obsidianBar.iconIndex = ModLoader.addOverride("/gui/items.png", "/ObsidianItemsPNGs/Items/ObsidianBar.png");

        // Name registration
        ModLoader.AddName(obsidianBar, "Obsidian Bar");

        // Recipes/Smelting
        ModLoader.AddSmelting(Block.obsidian.blockID, new ItemStack(obsidianBar));
    }

    public String Version()
    {
        return "1.8_1";
    }
}
