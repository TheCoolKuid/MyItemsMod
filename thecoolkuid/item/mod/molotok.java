package thecoolkuid.item.mod;

import com.jcraft.jorbis.Block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraftforge.common.util.EnumHelper;

public class molotok extends ItemPickaxe {

	public static ToolMaterial ALEBARD = EnumHelper.addToolMaterial("ALEBARD", 0, 80, 0F, 2F, 5);
	

	protected molotok() {
		
		 super(molotok.ALEBARD);
	        this.setCreativeTab(CreativeTabs.tabTools);  
	        this.setTextureName("itemmod:molotok");
	        
	        
	}
}
