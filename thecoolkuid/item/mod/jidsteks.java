package thecoolkuid.item.mod;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class jidsteks extends Item  {
	public  jidsteks (int par1)
	{
		 super();
	     this.setCreativeTab(CreativeTabs.tabMaterials);
	}
	@Override
	public void registerIcons(IIconRegister par1IconRegister)
	{
	    this.itemIcon = par1IconRegister.registerIcon("itemmod:jidsteks");
	}

}
