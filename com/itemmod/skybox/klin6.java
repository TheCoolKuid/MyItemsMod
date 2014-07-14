package com.itemmod.skybox;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class klin6 extends ItemSword {
public static ToolMaterial SPENDA = EnumHelper.addToolMaterial("SPENDA", 0, 600, 0F, 35F, 5);

	
	protected klin6() {
		
		
        super(klin6.SPENDA);
        this.setCreativeTab(CreativeTabs.tabCombat);  
        this.setTextureName("itemmod:klin6");
	}
}
