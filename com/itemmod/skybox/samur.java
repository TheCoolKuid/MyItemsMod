package com.itemmod.skybox;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class samur extends ItemSword {
public static ToolMaterial SPENDA = EnumHelper.addToolMaterial("SPENDA", 0, 600, 0F, 21F, 5);

	
	protected  samur() {
		
		
        super(samur.SPENDA);
        this.setCreativeTab(CreativeTabs.tabCombat);  
        this.setTextureName("itemmod:samur");
	}
}
        
