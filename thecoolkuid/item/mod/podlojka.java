package thecoolkuid.item.mod;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class podlojka extends Item  {
	public  podlojka(int par1)
	{
		 super();
	     this.setCreativeTab(CreativeTabs.tabMaterials);
	}
	@Override
	public void registerIcons(IIconRegister par1IconRegister)
	{
	    this.itemIcon = par1IconRegister.registerIcon("itemmod:podlojka");
	}

}
