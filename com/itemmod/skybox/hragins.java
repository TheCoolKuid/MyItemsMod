package com.itemmod.skybox;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class hragins extends ItemSword {
	public static ToolMaterial ALEBARD = EnumHelper.addToolMaterial("ALEBARD", 0, 600, 0F, 83F, 5);

	protected hragins() {
		
		 super(hragins.ALEBARD);
	        this.setCreativeTab(CreativeTabs.tabCombat);  
	        this.setTextureName("itemmod:hragins");
	        
	}
}


