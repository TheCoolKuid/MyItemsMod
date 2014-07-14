package com.itemmod.skybox;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class trash extends ItemSword{
public static ToolMaterial SPENDA = EnumHelper.addToolMaterial("SPENDA", 0, 230, 0F, 73F, 5);

	
	protected trash() {
		
		
        super(trash.SPENDA);
        this.setCreativeTab(CreativeTabs.tabCombat);  
        this.setTextureName("itemmod:trash");
}
}
