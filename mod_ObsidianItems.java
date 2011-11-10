package net.minecraft.src;

public class mod_ObsidianItems extends BaseMod
{
    // Blocks/Misc. items
    public static final Item obsidianBar = new Item(3000).setItemName("ObsidianBar");

    // Tools
    public static final Item obsidianPick = new ItemPickaxeObsidian(3002, EnumToolObsidian.OBSIDIAN).setItemName("ObsidianPick");
    public static final Item obsidianSpade = new ItemSpadeObsidian(3003, EnumToolObsidian.OBSIDIAN).setItemName("ObsidianSpade");
    public static final Item obsidianAxe = new ItemAxeObsidian(3004, EnumToolObsidian.OBSIDIAN).setItemName("ObsidianAxe");
    public static final Item obsidianSword = new ItemSwordObsidian(3005, EnumToolObsidian.OBSIDIAN).setItemName("ObsidianSword");

    public mod_ObsidianItems()
    {
        // Block registrations
        //////////////////////////////////////////////////////////////////////////////////

        // Texture overrides
        //////////////////////////////////////////////////////////////////////////////////
        obsidianBar.iconIndex = ModLoader.addOverride("/gui/items.png", "/ObsidianItemsPNGs/Items/ObsidianBar.png");

        obsidianPick.iconIndex = ModLoader.addOverride("/gui/items.png", "/ObsidianItemsPNGs/Items/ObsidianPick.png");
        obsidianSpade.iconIndex = ModLoader.addOverride("/gui/items.png", "/ObsidianItemsPNGs/Items/ObsidianSpade.png");
        obsidianAxe.iconIndex = ModLoader.addOverride("/gui/items.png", "/ObsidianItemsPNGs/Items/ObsidianAxe.png");
        obsidianSword.iconIndex = ModLoader.addOverride("/gui/items.png", "/ObsidianItemsPNGs/Items/ObsidianSword.png");
        //
        // Name registration
        //////////////////////////////////////////////////////////////////////////////////
        ModLoader.AddName(obsidianBar, "Obsidian Bar");

        ModLoader.AddName(obsidianPick, "Obsidian Pick");
        ModLoader.AddName(obsidianSpade, "Obsidian Spade");
        ModLoader.AddName(obsidianAxe, "Obsidian Axe");
        ModLoader.AddName(obsidianSword, "Obsidian Sword");

        // Recipes/Smelting
        //////////////////////////////////////////////////////////////////////////////////
        ModLoader.AddSmelting(Block.obsidian.blockID, new ItemStack(obsidianBar));

        ModLoader.AddRecipe(new ItemStack(obsidianPick, 1), new Object[] {"XXX", " | ", " | ", Character.valueOf('X'), obsidianBar, Character.valueOf('|'), Item.diamond});
        ModLoader.AddRecipe(new ItemStack(obsidianSpade, 1), new Object[] {" X ", " | ", " | ", Character.valueOf('X'), obsidianBar, Character.valueOf('|'), Item.diamond});
        ModLoader.AddRecipe(new ItemStack(obsidianAxe, 1),  new Object[] {"XX ", "X| ", " | ", Character.valueOf('X'), obsidianBar, Character.valueOf('|'), Item.diamond});
        ModLoader.AddRecipe(new ItemStack(obsidianSword, 1),  new Object[] {" X ", " X ", " | ", Character.valueOf('X'), obsidianBar, Character.valueOf('|'), Item.diamond});
        
    }
    

    public String Version()
    {
        return "1.8_1";
    }
}
