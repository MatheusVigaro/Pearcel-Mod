package com.miningmark48.pearcelmod.init;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemFood;

import com.miningmark48.pearcelmod.item.*;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {

	public static final ItemFood pearcel = new ItemPearcel();
	public static final ItemPearcelSword pearcelSword = new ItemPearcelSword(ToolMaterial.STONE);
	public static final ItemPearcelMod pearcelNugget = new ItemPearcelNugget();
	
	public static void init(){
		
		GameRegistry.registerItem(pearcel, "pearcelItem");
		GameRegistry.registerItem(pearcelSword, "pearcelSword");
		GameRegistry.registerItem(pearcelNugget, "pearcelNugget");
		
	}
	
}
