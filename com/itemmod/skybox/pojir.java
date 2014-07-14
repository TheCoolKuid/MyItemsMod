package com.itemmod.skybox;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class pojir extends ItemSword {
public static ToolMaterial SPENDA = EnumHelper.addToolMaterial("SPENDA", 0, 600, 0F, 268F, 5);

	
	protected  pojir() {
		
		
        super(pojir.SPENDA);
        this.setCreativeTab(CreativeTabs.tabCombat);  
        this.setTextureName("itemmod:pojir");
	}
}
