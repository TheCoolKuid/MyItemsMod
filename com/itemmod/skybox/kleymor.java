package com.itemmod.skybox;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class kleymor extends ItemSword  {
public static ToolMaterial SPENDA = EnumHelper.addToolMaterial("SPENDA", 0, 564, 0F, 85F, 5);

	
	protected  kleymor() {
		
		
        super( kleymor.SPENDA);
        this.setCreativeTab(CreativeTabs.tabCombat);  
        this.setTextureName("itemmod:kleymor");
}
}
