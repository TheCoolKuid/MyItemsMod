package thecoolkuid.item.mod;


import ic2.api.item.IC2Items;
import ic2.api.recipe.Recipes;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
 
@Mod (modid = "itemmod", name = "Items mod by TheCoolKuid", version = "beta0.1")
 /*
  * сделанно TheCoolKuid
  * @param Кривой и косой класс с неработающими рецептами.
  */

public class item {
	
	


	public static Item molotok;
	public static Item chip;
	public static Item jija;
	public static Item nojki;
	public static Item forma;
	public static Item jeja;
    public static Item forma2;
    public static Item microchip;
    public static Item tranzistor;
    public static Item jidsteks;
    public static Item kristal;
    public static Item kristal2;
    public static Item processor;
    public static Item podlojka;
    public static Item jidred;
    public static Item tekstolit;
    public static Item forma3;
    public static Item proc;
	@EventHandler
	public void preLoad(FMLPreInitializationEvent event)
	{
		
		
		
	/*Это добавляет новые айтамы. Я ведь быдлокодер , поэтому такой срач*/
	//Молоток. Пропадает при крафте(
		molotok = new molotok().setUnlocalizedName("molotok");
		GameRegistry.registerItem(molotok, "molotok");
		GameRegistry.addRecipe(new ItemStack(item.molotok, 1), 
				new Object[]{ "###", " Y ", " Y ",
               ('X'), Blocks.gravel, ('#'), Items.flint, ('Y'), Items.stick});
		//Плавленный кремний
		jija = new jija(0).setUnlocalizedName("jija");
		GameRegistry.registerItem(jija, "jija");
		//Форма для кремния
		 forma = new forma(0).setUnlocalizedName("forma");
		GameRegistry.registerItem(forma, "forma");
		GameRegistry.addRecipe(new ItemStack(item.forma, 1), 
				new Object[]{ "# #", " # ", "   ",
               ('X'), Blocks.gravel, ('#'), Blocks.stone, ('Y'), Items.stick});
		//Плавка кремния
		
		GameRegistry.addSmelting(Items.flint, new ItemStack(item.jija, 1), 0F);
		//Заготовка для платы.
		chip = new chip(0).setUnlocalizedName("chip");
		GameRegistry.registerItem(chip, "chip");
		GameRegistry.addShapelessRecipe(new ItemStack(item.chip, 2), new Object[] {item.jija ,item.forma});
		//Ножки	
		jeja = new jeja(0).setUnlocalizedName("jeja");
		GameRegistry.registerItem(jeja, "jeja");
		GameRegistry.addSmelting(Items.iron_ingot, new ItemStack(item.jeja, 1), 0F);
		//Форма для ножек
		forma2 = new forma2(0).setUnlocalizedName("forma2");
		GameRegistry.registerItem(forma2, "forma2");
		
		GameRegistry.addRecipe(new ItemStack(item.forma2, 1), 
				new Object[]{ "   ", "# #", "###",
               ('X'), Blocks.gravel, ('#'), Blocks.stone, ('Y'), Items.stick});
		//ножки
		nojki = new nojki(0).setUnlocalizedName("nojki");
		GameRegistry.registerItem(nojki , "nojki");
		GameRegistry.addShapelessRecipe(new ItemStack(item.nojki, 1), new Object[] {item.jeja ,item.forma2});
		//Кремневый микрочип
		microchip = new microchip(0).setUnlocalizedName("microchip");
		GameRegistry.registerItem(microchip, "microchip");
		GameRegistry.addShapelessRecipe(new ItemStack(item.microchip, 1), new Object[] {item.chip ,item.nojki});
		//Транзистр
		tranzistor = new tranzistor(0).setUnlocalizedName("tranzistor");
		GameRegistry.registerItem(tranzistor, "tranzistor");
		GameRegistry.addShapelessRecipe(new ItemStack(item.tranzistor, 1), new Object[] {item.chip ,Items.redstone});
		//Жидкое стекло
		jidsteks = new jidsteks(0).setUnlocalizedName("jidsteks");
		GameRegistry.registerItem(jidsteks, "jidsteks");
		GameRegistry.addSmelting(Blocks.glass, new ItemStack(item.jidsteks, 1), 0F);
		//Жидкий кристал
		kristal = new kristal(0).setUnlocalizedName("kristal");
		GameRegistry.registerItem(kristal, "kristal");
		GameRegistry.addShapelessRecipe(new ItemStack(item.kristal, 1), new Object[] {item.jidsteks ,item.jija});
		//Кристал
		kristal2 = new kristal2(0).setUnlocalizedName("kristal2");
		GameRegistry.registerItem(kristal2, "kristal2");
		GameRegistry.addSmelting(item.kristal, new ItemStack(item.kristal2, 1), 0F);
		//Вычислительное Ядро 
		processor = new processor(0).setUnlocalizedName("processor");
		GameRegistry.registerItem(processor, "processor");
		GameRegistry.addRecipe(new ItemStack(item.processor, 1), 
				new Object[]{ "#X#", "XYX", "#X#",
               ('X'), item.microchip, ('#'), item.tranzistor, ('Y'), item.kristal2});
		//Основа процессорного текстолита
			podlojka = new podlojka(0).setUnlocalizedName("podlojka");
			GameRegistry.registerItem(podlojka, "podlojka");
			GameRegistry.addSmelting(Blocks.stone, new ItemStack(item.podlojka, 1), 0F);
			//Жидкий редстоун
			jidred = new jidred(0).setUnlocalizedName("jidred");
			GameRegistry.registerItem(jidred, "jidred");
			GameRegistry.addSmelting(Blocks.redstone_block, new ItemStack(item.jidred, 1), 0F);
			//Процессорный текстолит
			tekstolit = new tekstolit(0).setUnlocalizedName("tekstolit");
			GameRegistry.registerItem(tekstolit, "tekstolit");
			GameRegistry.addShapelessRecipe(new ItemStack(item.tekstolit, 1), new Object[] {item.jidred ,item.podlojka});
			//Форма
			forma3 = new forma3(0).setUnlocalizedName("forma3");
			GameRegistry.registerItem(forma3, "forma3");
			GameRegistry.addRecipe(new ItemStack(item.forma3, 1), 
					new Object[]{ " X ", "X X", " X ",
	               ('X'), Blocks.stone, ('#'), item.tranzistor, ('Y'), item.kristal2});
			//Крышка для проца
			     //Будем юзать крышку из IC2
			//Термопаста
			    //Никакой тепастыю Заместо нее охладитель траханья из IC2
			//Процессор
			proc = new proc(0).setUnlocalizedName("proc");
			GameRegistry.registerItem(proc, "proc");
			//GameRegistry.addShapelessRecipe(new ItemStack(item.proc, 1), new Object[] {item.tekstolit ,IC2Items.getItem("advancedAlloy") ,IC2Items.getItem("reactorCoolantSimple") ,item.processor});
			
			/*Никак не относиться к коду выше*/
			
			  
			
	}
	@EventHandler
    public void serverStarting(FMLServerStartingEvent event)
    {
		
    }
}
