package com.itemmod.skybox;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class mech5  extends ItemSword {
		public static ToolMaterial SPENDA = EnumHelper.addToolMaterial("SPENDA", 0, 780, 0F, 139F, 5);

			
			protected  mech5() {
				
				
		        super(mech5.SPENDA);
		        this.setCreativeTab(CreativeTabs.tabCombat);  
		        this.setTextureName("itemmod:mech5");
			}
}
