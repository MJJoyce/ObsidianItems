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
    public static final Item obsidianHoe = new ItemHoeObsidian(3006, EnumToolObsidian.OBSIDIAN).setItemName("ObsidianHoe");

    // Armor
    public static final Item obsidianHelm = new ItemArmor(3010, 3, 5, 0).setItemName("obisidianHelm");
    public static final Item obsidianBody = new ItemArmor(3011, 3, 5, 1).setItemName("obisidianBody");
    public static final Item obsidianPants = new ItemArmor(3012, 3, 5, 2).setItemName("obisidianPants");
    public static final Item obsidianBoots = new ItemArmor(3013, 3, 5, 3).setItemName("obisidianBoots");

    public mod_ObsidianItems()
    {
        // Block registrations
        //////////////////////////////////////////////////////////////////////////////////

        // Texture overrides
        //////////////////////////////////////////////////////////////////////////////////
        // Ingots
        obsidianBar.iconIndex = ModLoader.addOverride("/gui/items.png", "/ObsidianItemsPNGs/Items/ObsidianBar.png");

        // Tools
        obsidianPick.iconIndex = ModLoader.addOverride("/gui/items.png", "/ObsidianItemsPNGs/Items/ObsidianPick.png");
        obsidianSpade.iconIndex = ModLoader.addOverride("/gui/items.png", "/ObsidianItemsPNGs/Items/ObsidianSpade.png");
        obsidianAxe.iconIndex = ModLoader.addOverride("/gui/items.png", "/ObsidianItemsPNGs/Items/ObsidianAxe.png");
        obsidianSword.iconIndex = ModLoader.addOverride("/gui/items.png", "/ObsidianItemsPNGs/Items/ObsidianSword.png");
        obsidianHoe.iconIndex = ModLoader.addOverride("/gui/items.png", "/ObsidianItemsPNGs/Items/ObsidianHoe.png");

        // Armor
        obsidianHelm.iconIndex = ModLoader.addOverride("/gui/items.png", "/ObsidianItemsPNGs/Items/ObsidianHelm.png");
        obsidianBody.iconIndex = ModLoader.addOverride("/gui/items.png", "/ObsidianItemsPNGs/Items/ObsidianChest.png");
        obsidianPants.iconIndex = ModLoader.addOverride("/gui/items.png", "/ObsidianItemsPNGs/Items/ObsidianPants.png");
        obsidianBoots.iconIndex = ModLoader.addOverride("/gui/items.png", "/ObsidianItemsPNGs/Items/ObsidianBoots.png");

        // Armor
        //////////////////////////////////////////////////////////////////////////////////
        ModLoader.AddArmor("ObsidianArmor");
        
        // Name registration
        //////////////////////////////////////////////////////////////////////////////////
        ModLoader.AddName(obsidianBar, "Obsidian Bar");

        ModLoader.AddName(obsidianPick, "Obsidian Pick");
        ModLoader.AddName(obsidianSpade, "Obsidian Spade");
        ModLoader.AddName(obsidianAxe, "Obsidian Axe");
        ModLoader.AddName(obsidianSword, "Obsidian Sword");
        ModLoader.AddName(obsidianHoe, "Obsidian Hoe");

        ModLoader.AddName(obsidianHelm, "Obsidian Helmet");
        ModLoader.AddName(obsidianBody, "Obsidian Chestpiece");
        ModLoader.AddName(obsidianPants, "Obsidian Pants");
        ModLoader.AddName(obsidianBoots, "Obsidian Boots");

        // Recipes/Smelting
        //////////////////////////////////////////////////////////////////////////////////
        ModLoader.AddSmelting(Block.obsidian.blockID, new ItemStack(obsidianBar));

        ModLoader.AddRecipe(new ItemStack(obsidianPick, 1), new Object[] {"XXX", " | ", " | ", Character.valueOf('X'), obsidianBar, Character.valueOf('|'), Item.diamond});
        ModLoader.AddRecipe(new ItemStack(obsidianSpade, 1), new Object[] {" X ", " | ", " | ", Character.valueOf('X'), obsidianBar, Character.valueOf('|'), Item.diamond});
        ModLoader.AddRecipe(new ItemStack(obsidianAxe, 1),  new Object[] {"XX ", "X| ", " | ", Character.valueOf('X'), obsidianBar, Character.valueOf('|'), Item.diamond});
        ModLoader.AddRecipe(new ItemStack(obsidianSword, 1),  new Object[] {" X ", " X ", " | ", Character.valueOf('X'), obsidianBar, Character.valueOf('|'), Item.diamond});
        ModLoader.AddRecipe(new ItemStack(obsidianHoe, 1),  new Object[] {"XX ", " | ", " | ", Character.valueOf('X'), obsidianBar, Character.valueOf('|'), Item.diamond});

        ModLoader.AddRecipe(new ItemStack(obsidianHelm, 1), new Object[] {"XXX", "X X", "   ", Character.valueOf('X'), obsidianBar});
        ModLoader.AddRecipe(new ItemStack(obsidianBody, 1), new Object[] {"X X", "XXX", "XXX", Character.valueOf('X'), obsidianBar});
        ModLoader.AddRecipe(new ItemStack(obsidianPants, 1), new Object[] {"XXX", "X X", "X X", Character.valueOf('X'), obsidianBar});
        ModLoader.AddRecipe(new ItemStack(obsidianBoots, 1), new Object[] {"   ", "X X", "X X", Character.valueOf('X'), obsidianBar});
        
    }
    

    public String Version()
    {
        return "1.8_1";
    }
}
