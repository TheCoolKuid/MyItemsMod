package com.itemmod.skybox;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class alebardItem extends ItemSword {
	
public static ToolMaterial ALEBARD = EnumHelper.addToolMaterial("ALEBARD", 0, 800, 0F, 367F, 5);

	protected alebardItem() {
		
		 super(alebardItem.ALEBARD);
	        this.setCreativeTab(CreativeTabs.tabCombat);  
	        this.setTextureName("itemmod:alebardItem");
	        
	}

}
