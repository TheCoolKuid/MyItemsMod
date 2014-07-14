package com.itemmod.skybox;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
@Mod (modid = "itemmod", name = "Items mod for SkyBox", version = "beta0.1")
public class ItemMod {
	

	@EventHandler
	public void preLoad(FMLPreInitializationEvent event)
	
	{
		
		Item sable;
		sable = new sableItem().setUnlocalizedName("sable");
		GameRegistry.registerItem(sable, "sable");
	    Item alebard;
	    alebard = new alebardItem().setUnlocalizedName("alebard");
		GameRegistry.registerItem(alebard, "alebard");
		Item alebarda2;
		alebarda2 = new alebard2Item().setUnlocalizedName("alebarda2");
		GameRegistry.registerItem(alebarda2, "alebarda2");
		Item angel;
		angel = new angel().setUnlocalizedName("angel");
		GameRegistry.registerItem(angel, "angel");
		
		Item see1;
		see1 = new see1().setUnlocalizedName("see1");
		GameRegistry.registerItem(see1, "see1");	
		
		Item volf;
		volf = new volf().setUnlocalizedName("volf");
		GameRegistry.registerItem(volf, "volf");	
		
		Item tooth;
		tooth = new tooth().setUnlocalizedName("tooth");
		GameRegistry.registerItem(tooth, "tooth");
		Item trash;
		trash = new trash().setUnlocalizedName("trash");
		GameRegistry.registerItem(trash, "trash");
		Item klin;
		klin = new klin().setUnlocalizedName("klin");
		GameRegistry.registerItem(klin, "klin");
		Item rezak;
		rezak = new rezak().setUnlocalizedName("rezak");
		GameRegistry.registerItem(rezak, "rezak");
		Item klin2;
		klin2 = new klin2().setUnlocalizedName("Kline");
		GameRegistry.registerItem(klin2, "Kline");
		Item klin3;
		klin3 = new klin3().setUnlocalizedName("klin3");
		GameRegistry.registerItem(klin3, "klin3");
		Item pot;
		pot = new pot().setUnlocalizedName("pot");
		GameRegistry.registerItem(pot, "pot");
		Item klin4;
		klin4 = new klin4().setUnlocalizedName("klin4");
		GameRegistry.registerItem(klin4, "klin4");
		Item klin5;
		klin5 = new klin5().setUnlocalizedName("klin5");
		GameRegistry.registerItem(klin5, "klin5");
		Item kleymor;
		kleymor = new kleymor().setUnlocalizedName("kleymor");
		GameRegistry.registerItem(kleymor, "kleymor");
		Item klin6;
		klin6 = new klin6().setUnlocalizedName("klin6");
		GameRegistry.registerItem(klin6, "klin6");
		Item mech;
		mech = new mech().setUnlocalizedName("mech");
		GameRegistry.registerItem(mech, "mech");
		Item rezak1;
		rezak1 = new rezak1().setUnlocalizedName("rezak1");
		GameRegistry.registerItem(rezak1, "rezak1");
		Item palash;
		palash = new palash().setUnlocalizedName("palash");
		GameRegistry.registerItem(palash, "palash");
		Item mech2;
		mech2 = new mech2().setUnlocalizedName("mech2");
		GameRegistry.registerItem(mech2, "mech2");
		Item mech3;
		mech3 = new mech3().setUnlocalizedName("mech3");
		GameRegistry.registerItem(mech3, "mech3");
		Item mohorez;
		mohorez = new mohorez().setUnlocalizedName("mohorez");
		GameRegistry.registerItem(mohorez, "mohorez");
		Item klin7;
		klin7 = new klin7().setUnlocalizedName("klin7");
		GameRegistry.registerItem(klin7, "klin7");
		Item jir;
		jir = new jir().setUnlocalizedName("jir");
		GameRegistry.registerItem(jir, "jir");
		Item pojir;
		pojir = new  pojir().setUnlocalizedName("pojir");
		GameRegistry.registerItem(pojir, "pojir");
		Item time;
		time = new time().setUnlocalizedName("time");
		GameRegistry.registerItem(time, "time");
		Item rot;
		rot = new rot().setUnlocalizedName("rot");
		GameRegistry.registerItem(rot, "rot�");
		Item mech4;
		mech4 = new mech4t().setUnlocalizedName("mech4");
		GameRegistry.registerItem(mech4, "mech4");
		Item samur;
		samur = new samur().setUnlocalizedName("samur");
		GameRegistry.registerItem(samur, "samur");
		Item saphir;
		saphir = new saphir().setUnlocalizedName("saphir");
		GameRegistry.registerItem(saphir, "saphir");
		Item skorp;
		skorp = new skorpr().setUnlocalizedName("skorp");
		GameRegistry.registerItem(skorp, "skorp");
		Item hragins;
		hragins = new hragins().setUnlocalizedName("hragins");
		GameRegistry.registerItem(hragins, "hragins");
		Item mech5;
		mech5 = new mech5().setUnlocalizedName("mech5");
		GameRegistry.registerItem(mech5, "mech5");
		Item Belok = new Belok(3200).setUnlocalizedName("Belok");
		GameRegistry.registerItem(Belok, "Belok");
		Item Bruho = new Bruho(3200).setUnlocalizedName("Bruho");
		GameRegistry.registerItem(Bruho, "Bruho");
		Item Klik = new Klik(3200).setUnlocalizedName("Klik");
		GameRegistry.registerItem(Klik, "Klik");
		Item glaz = new glaz(3200).setUnlocalizedName("glaz");
		GameRegistry.registerItem(glaz, "glaz");
		Item hvost = new hvost(3200).setUnlocalizedName("hvost");
		GameRegistry.registerItem(hvost, "hvost");
		Item rog = new rog(3200).setUnlocalizedName("rog");
		GameRegistry.registerItem(rog, "rog");
		Item roga = new roga(3200).setUnlocalizedName("roga");
		GameRegistry.registerItem(roga, "roga");
		Item glaz2 = new glaz2(3200).setUnlocalizedName("glaz2");
		GameRegistry.registerItem(glaz2, "glaz2");
		Item glaz3 = new glaz3(3200).setUnlocalizedName("glaz3");
		GameRegistry.registerItem(glaz3, "glaz3");
		Item glaz4 = new glaz4(3200).setUnlocalizedName("glaz4");
		GameRegistry.registerItem(glaz4, "glaz4");
		Item glaz5 = new glaz5(3200).setUnlocalizedName("glaz5");
		GameRegistry.registerItem(glaz5, "glaz5");
		Item glaz6 = new glaz6(3200).setUnlocalizedName("glaz6");
		GameRegistry.registerItem(glaz6, "glaz6");
		Item glaz7 = new glaz7(3200).setUnlocalizedName("glaz7");
		GameRegistry.registerItem(glaz7, "glaz7");
		Item jabra = new jabra(3200).setUnlocalizedName("jabra");
		GameRegistry.registerItem(jabra, "jabra");
		Item jalko = new jalko(3200).setUnlocalizedName("jalko");
		GameRegistry.registerItem(jalko, "jalko");
		Item jalo = new jalo(3200).setUnlocalizedName("jalo");
		GameRegistry.registerItem(jalo, "jalo");
		Item jele = new jele(3200).setUnlocalizedName("jele");
		GameRegistry.registerItem(jele, "jele");
		Item serdce = new serdce(3200).setUnlocalizedName("serdce");
		GameRegistry.registerItem(serdce, "serdce");
		Item vetochka = new vetochka(3200).setUnlocalizedName("vetochka");
		GameRegistry.registerItem(vetochka, "vetochka");
		Item koja = new koja(3200).setUnlocalizedName("koja");
		GameRegistry.registerItem(koja, "koja");
		Item zmeya = new zmeya(3200).setUnlocalizedName("zmeya");
		GameRegistry.registerItem(zmeya, "zmeya");
		Item zub = new zub(3200).setUnlocalizedName("zub");
		GameRegistry.registerItem(zub, "zub");
		Item ikra = new ikra(3200).setUnlocalizedName("ikra");
		GameRegistry.registerItem(ikra, "ikra");
		Item koj = new koj(3200).setUnlocalizedName("koj");
		GameRegistry.registerItem(koj, "koj");
		Item serdce2 = new serdce2(3200).setUnlocalizedName("serdce2");
		GameRegistry.registerItem(serdce2, "serdce2");
		Item klesh = new klesh(3200).setUnlocalizedName("klesh");
		GameRegistry.registerItem(klesh, "klesh");
		Item klesh2 = new klesh2(3200).setUnlocalizedName("klesh2");
		GameRegistry.registerItem(klesh2, "klesh2");
		Item kleshni = new kleshni(3200).setUnlocalizedName("kleshni");
		GameRegistry.registerItem(kleshni, "kleshni");
		Item obort = new obort(3200).setUnlocalizedName("obort");
		GameRegistry.registerItem(obort, "obort");
		Item ork = new ork(3200).setUnlocalizedName("ork");
		GameRegistry.registerItem(ork, "ork");
		//��� ��������� ����� � ���������� ������
		
		
	}
	
}
