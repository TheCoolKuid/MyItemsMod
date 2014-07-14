package com.itemmod.skybox;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class alebard2Item extends ItemSword {

	public static ToolMaterial ALEBARD = EnumHelper.addToolMaterial("ALEBARD", 0, 690, 0F, 136F, 5);

	protected alebard2Item() {
		
		 super(alebard2Item.ALEBARD);
	        this.setCreativeTab(CreativeTabs.tabCombat);  
	        this.setTextureName("itemmod:alebard2Item");
	        
	}
}
