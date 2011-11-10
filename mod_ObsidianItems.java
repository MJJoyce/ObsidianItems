package net.minecraft.src;

public class mod_ObsidianItems extends BaseMod
{
    // Blocks/Misc. items
    public static final Item obsidianBar = new Item(3000).setItemName("ObsidianBar");

    // Tools
    public static final Item obsidianPick = new ItemPickaxeObsidian(3002, EnumToolObsidian.OBSIDIAN).setItemName("ObsidianPick");

    public mod_ObsidianItems()
    {
        // Block registrations
        //////////////////////////////////////////////////////////////////////////////////

        // Texture overrides
        //////////////////////////////////////////////////////////////////////////////////
        obsidianBar.iconIndex = ModLoader.addOverride("/gui/items.png", "/ObsidianItemsPNGs/Items/ObsidianBar.png");

        obsidianPick.iconIndex = ModLoader.addOverride("/gui/items.png", "/ObsidianItemsPNGs/Items/ObsidianPick.png");

        // Name registration
        //////////////////////////////////////////////////////////////////////////////////
        ModLoader.AddName(obsidianBar, "Obsidian Bar");

        ModLoader.AddName(obsidianPick, "Obsidian Pick");

        // Recipes/Smelting
        //////////////////////////////////////////////////////////////////////////////////
        ModLoader.AddSmelting(Block.obsidian.blockID, new ItemStack(obsidianBar));

        ModLoader.AddRecipe(new ItemStack(obsidianPick, 1), new Object[] {"XXX", " | ", " | ", Character.valueOf('X'), obsidianBar, Character.valueOf('|'), Item.diamond});
    }

    public String Version()
    {
        return "1.8_1";
    }
}
