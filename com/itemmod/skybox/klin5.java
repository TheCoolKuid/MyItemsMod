package com.itemmod.skybox;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class klin5 extends ItemSword {
public static ToolMaterial SPENDA = EnumHelper.addToolMaterial("SPENDA", 0, 600, 0F, 42F, 5);

	
	protected  klin5() {
		
		
        super(klin5.SPENDA);
        this.setCreativeTab(CreativeTabs.tabCombat);  
        this.setTextureName("itemmod:klin5");
	}

}
