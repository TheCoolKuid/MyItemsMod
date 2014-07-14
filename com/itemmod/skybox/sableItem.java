package com.itemmod.skybox;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class sableItem extends ItemSword {
	

	public static ToolMaterial SPENDA = EnumHelper.addToolMaterial("SPENDA", 0, 564, 0F, 34.0F, 5);

	
	protected sableItem() {
		
		
        super(sableItem.SPENDA);
        this.setCreativeTab(CreativeTabs.tabCombat);  
        this.setTextureName("itemmod:sableItem");
        
 }
}
