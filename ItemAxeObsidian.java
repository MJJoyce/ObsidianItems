package net.minecraft.src;

public class ItemAxeObsidian extends ItemToolObsidian
{

    protected ItemAxeObsidian(int i, EnumToolObsidian enumtoolmaterial)
    {
        super(i, 3, enumtoolmaterial, blocksEffectiveAgainst);
    }

    private static Block blocksEffectiveAgainst[];

    static 
    {
        blocksEffectiveAgainst = (new Block[] {
            Block.planks, Block.bookShelf, Block.wood, Block.chest
        });
    }
}
