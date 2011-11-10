package net.minecraft.src;

public class ItemSwordObsidian extends Item
{

    public ItemSwordObsidian(int i, EnumToolObsidian enumtoolmaterial)
    {
        super(i);
        maxStackSize = 1;
        setMaxDamage(enumtoolmaterial.getMaxUses());
        weaponDamage = 4 + enumtoolmaterial.getDamageVsEntity() * 2;
    }

    public float getStrVsBlock(ItemStack itemstack, Block block)
    {
        return block.blockID != Block.web.blockID ? 1.5F : 15F;
    }

    public boolean hitEntity(ItemStack itemstack, EntityLiving entityliving, EntityLiving entityliving1)
    {
        itemstack.damageItem(1, entityliving1);
        return true;
    }

    public boolean onBlockDestroyed(ItemStack itemstack, int i, int j, int k, int l, EntityLiving entityliving)
    {
        itemstack.damageItem(2, entityliving);
        return true;
    }

    public int getDamageVsEntity(Entity entity)
    {
        return weaponDamage;
    }

    public boolean isFull3D()
    {
        return true;
    }

    public EnumAction func_35412_b(ItemStack itemstack)
    {
        return EnumAction.block;
    }

    public int func_35411_c(ItemStack itemstack)
    {
        return 0x11940;
    }

    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
        entityplayer.func_35199_b(itemstack, func_35411_c(itemstack));
        return itemstack;
    }

    public boolean canHarvestBlock(Block block)
    {
        return block.blockID == Block.web.blockID;
    }

    private int weaponDamage;
}
