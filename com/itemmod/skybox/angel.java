package com.itemmod.skybox;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class angel extends ItemSword {
	public static ToolMaterial ALEBARD = EnumHelper.addToolMaterial("ALEBARD", 0, 600, 0F, 194F, 5);

	protected angel() {
		
		 super(angel.ALEBARD);
	        this.setCreativeTab(CreativeTabs.tabCombat);  
	        this.setTextureName("itemmod:angelItem");
	        
	}
}
