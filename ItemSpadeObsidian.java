package net.minecraft.src;

public class ItemSpadeObsidian extends ItemToolObsidian
{
    public ItemSpadeObsidian(int i, EnumToolObsidian enumtoolmaterial)
    {
        super(i, 1, enumtoolmaterial, blocksEffectiveAgainst);
    }

    public boolean canHarvestBlock(Block block)
    {
        if(block == Block.snow)
        {
            return true;
        }
        return block == Block.blockSnow;
    }

    private static Block blocksEffectiveAgainst[];

    static 
    {
        blocksEffectiveAgainst = (new Block[] {
            Block.grass, Block.dirt, Block.sand, Block.gravel, Block.snow, 
            Block.blockSnow, Block.blockClay, Block.tilledField
        });
    }
}
