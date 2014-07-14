package com.itemmod.skybox;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class koja extends Item {
	public koja(int par1)
	{
		 super();
	     this.setCreativeTab(CreativeTabs.tabMaterials);
	}
	@Override
	public void registerIcons(IIconRegister par1IconRegister)
	{
	    this.itemIcon = par1IconRegister.registerIcon("itemmod:koja");
	}

}
