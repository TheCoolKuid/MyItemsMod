package com.itemmod.skybox;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class rot extends ItemSword{
public static ToolMaterial SPENDA = EnumHelper.addToolMaterial("SPENDA", 0, 564, 0F, 206F, 5);

	
	protected  rot() {
		
		
        super(rot.SPENDA);
        this.setCreativeTab(CreativeTabs.tabCombat);  
        this.setTextureName("itemmod: rot");
}
}
