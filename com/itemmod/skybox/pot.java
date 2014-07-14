package com.itemmod.skybox;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class pot extends ItemSword {

public static ToolMaterial SPENDA = EnumHelper.addToolMaterial("SPENDA", 0, 600, 0F, 190F, 5);

	
	protected  pot() {
		
		
        super(pot.SPENDA);
        this.setCreativeTab(CreativeTabs.tabCombat);  
        this.setTextureName("itemmod:pot");
	}
	@SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack par1ItemStack)
    {
        return true;
    }

}
